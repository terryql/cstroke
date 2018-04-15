package com.example.qi.paediatricstroketriagetool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class calculatorstroke extends AppCompatActivity {

    private TextView View2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatorstroke);
        View2 = (TextView) findViewById(R.id.stroke);


        Intent intent = getIntent();
        int gender_stroke = intent.getIntExtra("gender", 0);

        // Demographic variables
        int gender = intent.getIntExtra("gender", 0);
        int vertigo = intent.getIntExtra("vertigo", 0);
        int pmhx = intent.getIntExtra("pmhx", 0);
        int woke = intent.getIntExtra("woke", 0);
        int wellweekb4 = intent.getIntExtra("wellweekb4", 0);
        int medicaltransport = intent.getIntExtra("medicaltransport", 0);
        int headace = intent.getIntExtra("headacex", 0);
        int referred = intent.getIntExtra("referred", 0); // * not defined
        int highcategory = intent.getIntExtra("highcategory", 0); // * not defined
        int sudden = intent.getIntExtra("sudden", 0);//* not defined

        //grouped signs
        int gspeechpos = intent.getIntExtra("gspeechpos", 0); // * not defined
        int gmotorpos = intent.getIntExtra("gmotorpos", 0);// * not defined
        int glowgcs = intent.getIntExtra("glowgcs", 0);
        int gotherpos = intent.getIntExtra("gotherpos", 0);
        int gsensepos = intent.getIntExtra("gsensepos", 0); // not defined
        int gsignpos = intent.getIntExtra("gsignpos", 0);// not defined
        int gabngcs = intent.getIntExtra("gabngcs", 0);

        // Symptoms variables
        int vomit = intent.getIntExtra("vomit", 0);
        int dizziness = intent.getIntExtra("dizziness", 0);
        int speechloss = intent.getIntExtra("speechloass", 0);
        int focalnumb = intent.getIntExtra("focalnumb", 0);
        int focalweek = intent.getIntExtra("focalweek", 0);
        int seizure = intent.getIntExtra("seizure", 0);
        int mentalstate = intent.getIntExtra("mentalstate", 0);
        int loc = intent.getIntExtra("loc", 0);
        int other = intent.getIntExtra("other", 0);
        int vision = intent.getIntExtra("vision", 0);
        int ataxia = intent.getIntExtra("ataxia", 0);

        //Individual signs variables
        int pupils = intent.getIntExtra("pupils", 0);
        int abngcs = intent.getIntExtra("abngcs", 0);
        int lowGCS = intent.getIntExtra("lowGCS", 0);
        int walknotokcrf2 = intent.getIntExtra("walknotokcrf2", 0);
        int weakarm = intent.getIntExtra("weakarm", 0);
        int weakhand = intent.getIntExtra("weakhand", 0);
        int weakface = intent.getIntExtra("weakface", 0);
        int weakleg = intent.getIntExtra("weakleg", 0);
        int sensearm = intent.getIntExtra("sensearm", 0);
        int senseleg = intent.getIntExtra("senseleg", 0);
        int senseface = intent.getIntExtra("senseface", 0);
        int eyemovemt = intent.getIntExtra("eyemovemt", 0);
        int dysarthria = intent.getIntExtra("dysarthria", 0);
        int dysphasia = intent.getIntExtra("dysphasia", 0);
        int visualdef = intent.getIntExtra("visualdef", 0);
        int senseneg = intent.getIntExtra("senseneg", 0);
        int ataxia1 = intent.getIntExtra("ataxia1", 0);
        int noneuro = intent.getIntExtra("noneuro", 0);
        int other2 = intent.getIntExtra("other2", 0);

        //define probabilities
        double cart_mimics_model1 = 0;
        double cart_mimics_model2 = 0;
        double cart_mimics_model3 = 0;
        double cart_mimics_model4 = 0;
        double cart_mimics_model5 = 0;
        double cart_mimics_model6 = 0;
        double cart_ischaemic_model1 = 0;
        double cart_ischaemic_model2 = 0;
        double cart_ischaemic_model3 = 0;
        double cart_ischaemic_model4 = 0;
        double cart_ischaemic_model5 = 0;
        double cart_ischaemic_model6 = 0;
        double cart_haemorrhagic_model1 = 0;
        double cart_haemorrhagic_model2 = 0;
        double cart_haemorrhagic_model3 = 0;
        double cart_haemorrhagic_model4 = 0;
        double cart_haemorrhagic_model5 = 0;
        double cart_haemorrhagic_model6 = 0;

        double nb_mimics_model1 = 0;
        double nb_mimics_model3 = 0;
        double nb_mimics_model4 = 0;
        double nb_mimics_model5 = 0;
        double nb_mimics_model6 = 0;
        double nb_mimics_model2 = 0;
        double nb_ischaemic_model1 = 0;
        double nb_ischaemic_model2 = 0;
        double nb_ischaemic_model3 = 0;
        double nb_ischaemic_model4 = 0;
        double nb_ischaemic_model5 = 0;
        double nb_ischaemic_mode6 = 0;
        double nb_haemorrhagic_model1 = 0;
        double nb_haemorrhagic_model2 = 0;
        double nb_haemorrhagic_model3 = 0;
        double nb_haemorrhagic_model4 = 0;
        double nb_haemorrhagic_model5 = 0;
        double nb_haemorrhagic_model6 = 0;

        double buckets_mimics_cart = 0, buckets_haemorrhagic_cart = 0, buckets_ischaemic_cart = 0, stacking_mimics_cart = 0, stacking_haemorrhagic_cart = 0, stacking_ischaemic_cart = 0;
        double buckets_mimics_nb = 0, buckets_haemorrhagic_nb = 0, buckets_ischaemic_nb = 0, stacking_mimics_nb = 0, stacking_haemorrhagic_nb = 0, stacking_ischaemic_nb = 0;
        double probability_mimics = 0, probability_haemorrhagic = 0, probability_ischaemic = 0;

        // cart model1 of mimics classification
        if (other == 0 && medicaltransport == 1 && referred == 1) {
            cart_mimics_model1 = 0.17;
        } else {
            if (other == 0 && medicaltransport == 1 && referred == 1 && dizziness == 0 && seizure == 0 && pmhx == 0) {
                cart_mimics_model1 = 0.12;
            } else {
                if (other == 0 && medicaltransport == 1 && referred == 1 && dizziness == 0 && seizure == 0 && pmhx == 1) {
                    cart_mimics_model1 = 0.75;
                } else {
                    if (other == 0 && medicaltransport == 1 && referred == 1 && dizziness == 0 && seizure == 1) {
                        cart_mimics_model1 = 0.74;
                    } else {
                        if (other == 0 && medicaltransport == 1 && referred == 1 && dizziness == 1) {
                            cart_mimics_model1 = 0.94;
                        } else {
                            if (other == 0 && medicaltransport == 1 && mentalstate == 1) {
                                cart_mimics_model1 = 0.37;
                            } else {
                                if (other == 0 && medicaltransport == 1 && mentalstate == 0 && speechloss == 1 && focalweek == 0) {
                                    cart_mimics_model1 = 0.42;
                                } else {
                                    if ((other == 0 && medicaltransport == 1 && mentalstate == 0 && speechloss == 1 && focalweek == 1)) {
                                        cart_mimics_model1 = 0.89;
                                    } else {
                                        if (other == 1) {
                                            cart_mimics_model1 = 0.94;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        //cart model1 of ischaemic stroke classification
        if (focalweek == 0) {
            cart_ischaemic_model1 = 0.07;
        } else {
            if (focalweek == 1 && speechloss == 0) {
                cart_ischaemic_model1 = 0.18;
            } else {
                if (focalweek == 1 && speechloss == 0 && ataxia1 == 0) {
                    cart_ischaemic_model1 = 0.3;
                } else {
                    if (focalweek == 1 && speechloss == 0 && ataxia1 == 1 && focalnumb == 1) {
                        cart_ischaemic_model1 = 0.37;
                    } else {
                        cart_ischaemic_model1 = 0.82;
                    }
                }
            }
        }

        //cart model1 of haemorrhagic stroke classification
        if (highcategory == 0) {
            cart_haemorrhagic_model1 = 0.05;
        } else {
            if (loc == 0) {
                if (dizziness == 1) {
                    cart_haemorrhagic_model1 = 0;
                } else {
                    if (vomit == 0) {
                        cart_haemorrhagic_model1 = 0.13;
                    } else {
                        if (referred == 0) {
                            cart_haemorrhagic_model1 = 0.2;
                        } else {
                            cart_haemorrhagic_model1 = 0.57;
                        }
                    }
                }
            } else {
                cart_haemorrhagic_model1 = 0.53;
            }
        }

        // cart model2 of stroke mimics classification
        if (gspeechpos == 1 && gmotorpos == 1) {
            cart_mimics_model2 = 0.31;
        } else {
            if (gspeechpos == 1 && gmotorpos == 0) {
                cart_mimics_model2 = 0.71;
            }
            if (gspeechpos == 0 && highcategory == 1 && woke == 0 && gmotorpos == 1) {
                cart_mimics_model2 = 0.25;
            } else {
                if (gspeechpos == 0 && highcategory == 1 && woke == 0 && wellweekb4 == 1 && gmotorpos == 0 && glowgcs == 1) {
                    cart_mimics_model2 = 0.14;
                } else {
                    if (gspeechpos == 0 && highcategory == 1 && woke == 0 && wellweekb4 == 1 && gmotorpos == 0 && glowgcs == 0) {
                        cart_mimics_model2 = 0.64;
                    } else {
                        if (gspeechpos == 0 && highcategory == 1 && woke == 0 && wellweekb4 == 0) {
                            cart_mimics_model2 = 0.8;
                        } else {
                            if (gspeechpos == 0 && highcategory == 1 && woke == 1) {
                                cart_mimics_model2 = 0.87;
                            } else {
                                if (speechloss == 0 && highcategory == 0 && medicaltransport == 1 && referred == 1) {
                                    cart_mimics_model2 = 0.37;
                                } else {
                                    if (speechloss == 0 && highcategory == 0 && medicaltransport == 1 && referred == 0) {
                                        cart_mimics_model2 = 0.82;
                                    } else {
                                        if (speechloss == 0 && highcategory == 0 && medicaltransport == 0) {
                                            cart_mimics_model2 = 0.91;
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }

        // cart model2 of ischaemic stroke classification
        if (gmotorpos == 0) {
            cart_ischaemic_model2 = 0.05;
        } else {
            if (gspeechpos == 0) {
                if (medicaltransport == 0) {
                    cart_ischaemic_model2 = 0.15;
                } else {
                    if (wellweekb4 == 0) {
                        cart_ischaemic_model2 = 0.09;
                    } else {
                        if (gender == 0) {
                            cart_ischaemic_model2 = 0.33;
                        } else {
                            cart_ischaemic_model2 = 0.73;
                        }
                    }
                }
            } else {
                if (gotherpos == 1) {
                    cart_ischaemic_model2 = 0.45;
                } else {
                    cart_ischaemic_model2 = 0.71;
                }
            }
            if (gmotorpos == 0) {
                cart_ischaemic_model2 = 0.05;
            } else {
                if (gmotorpos == 0 && gspeechpos == 0 && medicaltransport == 0) {
                    cart_ischaemic_model2 = 0.15;
                } else {
                    if (gmotorpos == 0 && gspeechpos == 0 && medicaltransport == 1 && wellweekb4 == 0) {
                        cart_ischaemic_model2 = 0.09;
                    } else {
                        if (gmotorpos == 0 && gspeechpos == 0 && medicaltransport == 1 && wellweekb4 == 1 && gender == 0) {
                            cart_ischaemic_model2 = 0.33;
                        } else {
                            if (gmotorpos == 0 && gspeechpos == 0 && medicaltransport == 1 && wellweekb4 == 1 && gender == 1) {
                                cart_ischaemic_model2 = 0.73;
                            } else {
                                if (gmotorpos == 0 && gspeechpos == 0 && gotherpos == 1) {
                                    cart_ischaemic_model2 = 0.45;
                                } else {
                                    if (gmotorpos == 0 && gspeechpos == 0 && gotherpos == 0) {
                                        cart_ischaemic_model2 = 0.71;
                                    }
                                }
                            }
                        }
                    }
                }

                // cart model2 of haemorrhagic stroke classification
                if (glowgcs == 0) {
                    if (medicaltransport == 0) {
                        cart_haemorrhagic_model2 = 0.03;
                    } else {
                        if (gmotorpos == 1) {
                            cart_haemorrhagic_model2 = 0.05;
                        } else {
                            if (referred == 0) {
                                cart_haemorrhagic_model2 = 0.11;
                            } else {
                                cart_haemorrhagic_model2 = 0.54;
                            }
                        }
                    }
                } else {
                    if (gmotorpos == 1) {
                        cart_haemorrhagic_model2 = 0.22;
                    } else {
                        cart_haemorrhagic_model2 = 0.64;
                    }
                }

                // CART model3 of stroke mimics classification
                if (weakhand == 1) {
                    if (other == 0) {
                        if (weakface == 1) {
                            cart_mimics_model3 = 0.19;
                        } else {
                            cart_mimics_model3 = 0.59;
                        }
                    } else {
                        cart_mimics_model3 = 1;
                    }
                } else {
                    if (pupils == 1) {
                        cart_mimics_model3 = 0.39;
                    } else {
                        if (other == 0) {
                            if (speechloss == 1) {
                                if (weakface == 1) {
                                    cart_mimics_model3 = 0.35;
                                } else {
                                    cart_mimics_model3 = 0.84;
                                }
                            } else {
                                cart_mimics_model3 = 0.84;
                            }
                        } else {
                            cart_mimics_model3 = 0.93;
                        }
                    }
                }

                // CART model3 of haemorrhagic stroke classification
                if (pupils == 0) {
                    if (focalweek == 1) {
                        cart_haemorrhagic_model3 = 0.03;
                    } else {
                        if (focalnumb == 1) {
                            cart_haemorrhagic_model3 = 0;
                        } else {
                            if (dizziness == 1) {
                                cart_haemorrhagic_model3 = 0.04;
                            } else {
                                if (eyemovemt == 1) {
                                    cart_haemorrhagic_model3 = 0;
                                } else {
                                    cart_haemorrhagic_model3 = 0.18;
                                }
                            }
                        }
                    }
                } else {
                    cart_haemorrhagic_model3 = 0.55;
                }

                //CART model3 of ischaemic stroke classification
                if (weakarm == 0) {
                    if (speechloss == 0) {
                        cart_ischaemic_model3 = 0.04;
                    } else {
                        if (weakface == 0) {
                            cart_ischaemic_model3 = 0.03;
                        } else {
                            cart_ischaemic_model3 = 0.62;
                        }
                    }
                } else {
                    if (weakface == 0) {
                        cart_ischaemic_model3 = 0.22;
                    } else {
                        if (vomit == 1) {
                            cart_ischaemic_model3 = 0.33;
                        } else {
                            cart_ischaemic_model3 = 0.82;
                        }
                    }
                }

                //CART model4 of stroke mimics classification
                if (other == 0) {
                    if (speechloss == 1) {
                        cart_mimics_model4 = 0.28;
                    } else {
                        if (glowgcs == 1) {
                            cart_mimics_model4 = 0.36;
                        } else {
                            if (gmotorpos == 1) {
                                if (speechloss == 1) {
                                    cart_mimics_model4 = 0.36;
                                } else {
                                    cart_mimics_model4 = 0.77;
                                }
                            } else {
                                cart_mimics_model4 = 0.82;
                            }
                        }
                    }
                } else {
                    cart_mimics_model4 = 0.94;
                }

                //CART model4 of haemorrhagic stroke classification
                if (glowgcs == 0) {
                    cart_haemorrhagic_model4 = 0.07;
                } else {
                    if (focalweek == 1) {
                        cart_haemorrhagic_model4 = 0.18;
                    } else {
                        cart_haemorrhagic_model4 = 0.75;
                    }
                }

                //CART model4 of ischaemic stroke classification
                if (gmotorpos == 0) {
                    cart_ischaemic_model4 = 0.05;
                } else {
                    if (other == 1) {
                        cart_haemorrhagic_model4 = 0;
                    } else {
                        if (speechloss == 0) {
                            if (visualdef == 1) {
                                cart_haemorrhagic_model4 = 0;
                            } else {
                                cart_haemorrhagic_model4 = 0.27;
                            }
                        } else {
                            if (vomit == 1) {
                                cart_haemorrhagic_model4 = 0.37;
                            } else {
                                cart_haemorrhagic_model4 = 0.76;
                            }
                        }
                    }
                }

                // CART model5 of stroke mimics classification
                if (weakhand == 1) {
                    if (weakface == 1) {
                        cart_mimics_model5 = 0.22;
                    } else {
                        cart_mimics_model5 = 0.68;
                    }
                } else {
                    if (dysarthria == 1) {
                        cart_mimics_model5 = 0.55;
                    } else {
                        cart_mimics_model5 = 0.84;
                    }
                }

                // CART model5 of haemorrhagic stroke clasification: NA
                // CART model5 of ischaemics stroke classification
                if (weakarm == 0) {
                    cart_ischaemic_model5 = 0.06;
                } else {
                    if (weakface == 0) {
                        cart_ischaemic_model5 = 0.22;
                    } else {
                        cart_ischaemic_model5 = 0.71;
                    }
                }

                //CART model6 of stroke mimics classification
                if (weakhand == 1) {
                    if (weakface == 1) {
                        cart_mimics_model6 = 0.22;
                    } else {
                        cart_mimics_model6 = 0.68;
                    }
                } else {
                    if (glowgcs == 1) {
                        cart_mimics_model6 = 0.46;
                    } else {
                        if (dysarthria == 1) {
                            cart_mimics_model6 = 0.6;
                        } else {
                            cart_mimics_model6 = 0.86;
                        }
                    }
                }

                // CART model6 of haemorrhaigic stroke classification;
                if (glowgcs == 0) {
                    cart_haemorrhagic_model6 = 0.07;
                    if (speechloss == 1) {
                        cart_haemorrhagic_model6 = 0.25;
                    } else {
                        cart_haemorrhagic_model6 = 0.6;
                    }
                }

                //CART model6 of ischaemic stroke classification
                if (weakarm == 0) {
                    cart_ischaemic_model6 = 0.06;
                } else {
                    if (weakface == 0) {
                        cart_ischaemic_model6 = 0.22;
                    } else {
                        cart_ischaemic_model6 = 0.71;
                    }
                }

                //Naive Bayes model1 of stroke mimcis classification;
                if (referred == 0) {
                    if (sudden == 0) {
                        if (pmhx == 0) {
                            if (gender == 0) {
                                nb_mimics_model1 = 0.87;
                            } else {
                                nb_mimics_model1 = 0.86;
                            }
                        } else {
                            if (headace == 0) {
                                nb_mimics_model1 = 0.8;
                            } else {
                                nb_mimics_model1 = 0.76;
                            }
                        }
                    } else {
                        if (highcategory == 0) {
                            if (seizure == 0) {
                                if (focalnumb == 0) {
                                    if (visualdef == 0) {
                                        if (speechloss == 0) {
                                            if (medicaltransport == 0) {
                                                nb_mimics_model1 = 0.88;
                                            } else {
                                                nb_mimics_model1 = 0.37;
                                            }
                                        } else {
                                            nb_mimics_model1 = 0.89;
                                        }
                                    } else {
                                        nb_mimics_model1 = 0.89;
                                    }
                                } else {
                                    nb_mimics_model1 = 0.81;
                                }
                            } else {
                                nb_mimics_model1 = 0.54;
                            }
                        } else {
                            if (pmhx == 0) {
                                if (wellweekb4 == 0) {
                                    nb_mimics_model1 = 0.65;
                                } else {
                                    if (focalweek == 0) {
                                        if (mentalstate == 0) {
                                            nb_mimics_model1 = 0.44;
                                        } else {
                                            nb_mimics_model1 = 0.21;
                                        }
                                    } else {
                                        nb_mimics_model1 = 0.79;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (medicaltransport == 0) {
                        if (other == 0) {
                            if (wellweekb4 == 0) {
                                nb_mimics_model1 = 0.73;
                            } else {
                                if (headace == 0) {
                                    nb_mimics_model1 = 0.73;
                                } else {
                                    nb_mimics_model1 = 0.92;
                                }
                            }
                        }
                    } else {
                        if (pmhx == 0) {
                            if (focalnumb == 0) {
                                if (seizure == 0) {
                                    nb_mimics_model1 = 0.33;
                                } else {
                                    nb_mimics_model1 = 0.75;
                                }
                            } else {
                                nb_mimics_model1 = 0.53;
                            }
                        } else {
                            nb_mimics_model1 = 0.87;
                        }
                    }
                }

                //Naive Bayes model1 of ischaemic stroke classification;
                if (highcategory == 0) {
                    if (other == 0) {
                        if (speechloss == 0) {
                            if (woke == 0) {
                                nb_ischaemic_model1 = 0.09;
                            } else {
                                nb_ischaemic_model1 = 0.19;
                            }
                        } else {
                            if (mentalstate == 0) {
                                if (wellweekb4 == 0) {
                                    nb_ischaemic_model1 = 0.86;
                                } else {
                                    nb_ischaemic_model1 = 0.34;
                                }
                            } else {
                                nb_ischaemic_model1 = 0.67;
                            }
                        }
                    } else {
                        nb_ischaemic_model1 = 0.02;
                    }
                } else {
                    if (wellweekb4 == 0) {
                        nb_ischaemic_model1 = 0.23;
                    } else {
                        if (vertigo == 0) {
                            if (vomit == 0) {
                                if (visualdef == 0) {
                                    if (focalweek == 0) {
                                        nb_ischaemic_model1 = 0.08;
                                    } else {
                                        nb_ischaemic_model1 = 0.74;
                                    }
                                } else {
                                    nb_ischaemic_model1 = 0.17;
                                }
                            } else {
                                if (referred == 0) {
                                    if (pmhx == 0) {
                                        nb_ischaemic_model1 = 0.08;
                                    } else {
                                        nb_ischaemic_model1 = 0.2;
                                    }
                                } else {
                                    nb_ischaemic_model1 = 0.09;
                                }
                            }
                        } else {
                            nb_ischaemic_model1 = 0.59;
                        }
                    }

                    //Naive Bayes model1 of haemorrhagic stroke classification;
                    if (seizure == 0) {
                        if (sudden == 0) {
                            if (wellweekb4 == 0) {
                                nb_haemorrhagic_model1 = 0.04;
                            } else {
                                if (focalnumb == 0) {
                                    if (pmhx == 0) {
                                        nb_haemorrhagic_model1 = 0.07;
                                    } else {
                                        nb_haemorrhagic_model1 = 0.2;
                                    }
                                } else {
                                    nb_haemorrhagic_model1 = 0.09;
                                }
                            }
                        } else {
                            if (referred == 0) {
                                if (vomit == 0) {
                                    if (dizziness == 0) {
                                        if (highcategory == 0) {
                                            nb_haemorrhagic_model1 = 0.03;
                                        } else {
                                            nb_haemorrhagic_model1 = 0.22;
                                        }
                                    } else {
                                        nb_haemorrhagic_model1 = 0.11;
                                    }
                                } else {
                                    if (medicaltransport == 0) {
                                        if (highcategory == 0) {
                                            nb_haemorrhagic_model1 = 0.04;
                                        } else {
                                            nb_haemorrhagic_model1 = 0.33;
                                        }
                                    } else {
                                        nb_haemorrhagic_model1 = 0.31;
                                    }
                                }
                            } else {
                                if (mentalstate == 0) {
                                    if (dizziness == 0) {
                                        if (highcategory == 0) {
                                            if (pmhx == 0) {
                                                if (wellweekb4 == 0) {
                                                    nb_haemorrhagic_model1 = 0.09;
                                                } else {
                                                    nb_haemorrhagic_model1 = 0.16;
                                                }
                                            } else {
                                                nb_haemorrhagic_model1 = 0.11;
                                            }
                                        } else {
                                            nb_haemorrhagic_model1 = 0.31;
                                        }
                                    } else {
                                        nb_haemorrhagic_model1 = 0.15;
                                    }
                                } else {
                                    nb_haemorrhagic_model1 = 0.29;
                                }
                            }
                        }
                    } else {
                        if (medicaltransport == 0) {
                            nb_haemorrhagic_model1 = 0.12;
                        } else {
                            if (woke == 0) {
                                if (other == 0) {
                                    if (highcategory == 0) {
                                        nb_haemorrhagic_model1 = 0.09;
                                    } else {
                                        nb_haemorrhagic_model1 = 0.36;
                                    }
                                } else {
                                    nb_haemorrhagic_model1 = 0.22;
                                }
                            } else {
                                nb_haemorrhagic_model1 = 0.18;
                            }
                        }
                    }

                    //Naive Bayes model2 of stroke mimics classification;
                    if (highcategory == 0) {
                        if (gsensepos == 0) {
                            if (wellweekb4 == 0) {
                                if (sudden == 0) {
                                    nb_mimics_model2 = 0.84;
                                } else {
                                    if (gotherpos == 0) {
                                        nb_mimics_model2 = 0.8;
                                    } else {
                                        nb_mimics_model2 = 0.79;
                                    }
                                }
                            } else {
                                if (gsignpos == 0) {
                                    nb_mimics_model2 = 0.89;
                                } else {
                                    if (gender == 0) {
                                        if (pmhx == 0) {
                                            nb_mimics_model2 = 0.77;
                                        } else {
                                            nb_mimics_model2 = 0.58;
                                        }
                                    } else {
                                        if (sudden == 0) {
                                            nb_mimics_model2 = 0.83;
                                        } else {
                                            if (woke == 0) {
                                                nb_mimics_model2 = 0.53;
                                            } else {
                                                nb_mimics_model2 = 0.18;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (woke == 0) {
                                if (gender == 0) {
                                    nb_mimics_model2 = 0.8;
                                } else {
                                    nb_mimics_model2 = 0.88;
                                }
                            } else {
                                nb_mimics_model2 = 0.6;
                            }
                        }
                    } else {
                        if (pmhx == 0) {
                            if (wellweekb4 == 0) {
                                nb_mimics_model2 = 0.47;
                            } else {
                                if (referred == 0) {
                                    if (woke == 0) {
                                        if (glowgcs == 0) {
                                            nb_mimics_model2 = 0.08;
                                        } else {
                                            nb_mimics_model2 = 0.5;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (woke == 0) {
                                if (referred == 0) {
                                    nb_mimics_model2 = 0.83;
                                } else {
                                    nb_mimics_model2 = 0.27;
                                }
                            } else {
                                nb_mimics_model2 = 0.62;
                            }
                        }
                    }


                    //Naive Bayes model2 of ischaemic stroke classification;
                    if (pmhx == 0) {
                        if (referred == 0) {
                            if (highcategory == 0) {
                                if (medicaltransport == 0) {
                                    if (gender == 0) {
                                        nb_ischaemic_model2 = 0.03;
                                    } else {
                                        if (gsensepos == 0) {
                                            if (wellweekb4 == 0) {
                                                nb_ischaemic_model2 = 0.08;
                                            } else {
                                                nb_ischaemic_model2 = 0.21;
                                            }
                                        } else {
                                            nb_ischaemic_model2 = 0.14;
                                        }
                                    }
                                }
                            } else {
                                if (gsensepos == 0) {
                                    if (medicaltransport == 0) {
                                        nb_ischaemic_model2 = 0.27;
                                    } else {
                                        if (gabngcs == 0) {
                                            nb_ischaemic_model2 = 0.56;
                                        } else {
                                            nb_ischaemic_model2 = 0.12;
                                        }
                                    }
                                } else {
                                    nb_ischaemic_model2 = 0.4;
                                }
                            }
                        }
                    } else {
                        if (highcategory == 0) {
                            if (gspeechpos == 0) {
                                if (gmotorpos == 0) {
                                    nb_ischaemic_model2 = 0.07;
                                } else {
                                    nb_ischaemic_model2 = 0.28;
                                }
                            } else {
                                nb_ischaemic_model2 = 0.46;
                            }
                        } else {
                            if (wellweekb4 == 0) {
                                nb_ischaemic_model2 = 0.15;
                            } else {
                                if (gsignpos == 0) {
                                    nb_ischaemic_model2 = 0.2;
                                } else {
                                    nb_ischaemic_model2 = 0.29;
                                }
                            }
                        }
                    }

                    //Naive Bayes model2 of haemorrhagic stroke classification;
                    if (sudden == 0) {
                        nb_haemorrhagic_model2 = 0.05;
                    } else {
                        if (gender == 0) {
                            if (gabngcs == 0) {
                                if (pmhx == 0) {
                                    if (wellweekb4 == 0) {
                                        nb_haemorrhagic_model2 = 0;
                                    } else {
                                        if (medicaltransport == 0) {
                                            nb_haemorrhagic_model2 = 0.09;
                                        } else {
                                            nb_haemorrhagic_model2 = 0.2;
                                        }
                                    }
                                } else {
                                    nb_haemorrhagic_model2 = 0.03;
                                }
                            } else {
                                if (woke == 0) {
                                    if (referred == 0) {
                                        if (pmhx == 0) {
                                            nb_haemorrhagic_model2 = 0.46;
                                        } else {
                                            nb_haemorrhagic_model2 = 0.09;
                                        }
                                    } else {
                                        nb_haemorrhagic_model2 = 0.09;
                                    }
                                } else {
                                    nb_haemorrhagic_model2 = 0.2;
                                }
                            }
                        } else {
                            if (gabngcs == 0) {
                                nb_haemorrhagic_model2 = 0.08;
                            } else {
                                if (medicaltransport == 0) {
                                    nb_haemorrhagic_model2 = 0.4;
                                } else {
                                    nb_haemorrhagic_model2 = 0.42;
                                }
                            }
                        }
                    }

                    //Naive Bayes model3 of stroke mimics classification;
                    if (weakhand == 0) {
                        if (other2 == 0) {
                            if (visualdef == 0) {
                                if (eyemovemt == 0) {
                                    if (sensearm == 0) {
                                        if (other == 0) {
                                            if (loc == 0) {
                                                if (ataxia1 == 0) {
                                                    if (mentalstate == 0) {
                                                        if (vision == 0) {
                                                            if (focalweek == 0) {
                                                                if (headace == 0) {
                                                                    nb_mimics_model3 = 0.82;
                                                                } else {
                                                                    nb_mimics_model3 = 0.78;
                                                                }
                                                            } else {
                                                                nb_mimics_model3 = 0.89;
                                                            }
                                                        } else {
                                                            nb_mimics_model3 = 0.88;
                                                        }
                                                    } else {
                                                        nb_mimics_model3 = 0.45;
                                                    }
                                                } else {
                                                    nb_mimics_model3 = 0.9;
                                                }
                                            } else {
                                                if (mentalstate == 0) {
                                                    nb_mimics_model3 = 0.69;
                                                } else {
                                                    nb_mimics_model3 = 0.61;
                                                }
                                            }
                                        } else {
                                            nb_mimics_model3 = 0.93;
                                        }
                                    } else {
                                        nb_mimics_model3 = 0.91;
                                    }
                                } else {
                                    nb_mimics_model3 = 0.72;
                                }
                            } else {
                                if (ataxia1 == 0) {
                                    nb_mimics_model3 = 0.75;
                                } else {
                                    nb_mimics_model3 = 0.83;
                                }
                            }
                        } else {
                            if (headace == 0) {
                                nb_mimics_model3 = 0.89;
                            } else {
                                nb_mimics_model3 = 0.69;
                            }
                        }
                    } else {
                        if (ataxia1 == 0) {
                            if (vertigo == 0) {
                                if (seizure == 0) {
                                    if (ataxia1 == 0) {
                                        if (walknotokcrf2 == 0) {
                                            if (senseface == 0) {
                                                if (mentalstate == 0) {
                                                    nb_mimics_model3 = 0.54;
                                                } else {
                                                    nb_mimics_model3 = 0.24;
                                                }
                                            } else {
                                                nb_mimics_model3 = 0.56;
                                            }
                                        } else {
                                            nb_mimics_model3 = 0.05;
                                        }
                                    } else {
                                        nb_mimics_model3 = 0.14;
                                    }
                                } else {
                                    nb_mimics_model3 = 0.3;
                                }
                            } else {
                                nb_mimics_model3 = 0.74;
                            }
                        } else {
                            nb_mimics_model3 = 0.56;
                        }

                        //Naive Bayes model3 of ischaemic stroke classification;
                        if (weakleg == 0) {
                            if (other == 0) {
                                if (visualdef == 0) {
                                    if (weakarm == 0) {
                                        if (vision == 0) {
                                            if (senseleg == 0) {
                                                if (loc == 0) {
                                                    if (dysphasia == 0) {
                                                        if (headace == 0) {
                                                            nb_ischaemic_model3 = 0.09;
                                                        } else {
                                                            if (walknotokcrf2 == 0) {
                                                                if (focalnumb == 0) {
                                                                    if (seizure == 0) {
                                                                        nb_ischaemic_model3 = 0.13;
                                                                    } else {
                                                                        nb_ischaemic_model3 = 0.25;
                                                                    }
                                                                } else {
                                                                    nb_ischaemic_model3 = 0.08;
                                                                }
                                                            } else {
                                                                nb_ischaemic_model3 = 0.25;
                                                            }
                                                        }
                                                    } else {
                                                        nb_ischaemic_model3 = 0.74;
                                                    }
                                                } else {
                                                    nb_ischaemic_model3 = 0.03;
                                                }
                                            } else {
                                                nb_ischaemic_model3 = 0.25;
                                            }
                                        } else {
                                            nb_ischaemic_model3 = 0.13;
                                        }
                                    } else {
                                        nb_ischaemic_model3 = 0.34;
                                    }
                                } else {
                                    nb_ischaemic_model3 = 0.11;
                                }
                            } else {
                                nb_ischaemic_model3 = 0.02;
                            }
                        } else {
                            if (weakhand == 0) {
                                nb_ischaemic_model3 = 0.1;
                            } else {
                                if (ataxia1 == 0) {
                                    if (senseneg == 0) {
                                        nb_ischaemic_model3 = 0.63;
                                    } else {
                                        nb_ischaemic_model3 = 0.66;
                                    }
                                } else {
                                    nb_ischaemic_model3 = 0.3;
                                }
                            }
                        }

                        //Naive Bayes model3 of haemorrhagic stroke classification;
                        if (focalweek == 0) {
                            if (weakleg == 0) {
                                if (seizure == 0) {
                                    if (senseleg == 0) {
                                        if (eyemovemt == 0) {
                                            if (speechloss == 0) {
                                                if (other2 == 0) {
                                                    if (weakarm == 0) {
                                                        if (focalnumb == 0) {
                                                            if (visualdef == 0) {
                                                                if (ataxia1 == 0) {
                                                                    if (vomit == 0) {
                                                                        nb_haemorrhagic_model3 = 0.19;
                                                                    } else {
                                                                        if (other == 0) {
                                                                            if (vision == 0) {
                                                                                nb_haemorrhagic_model3 = 0.39;
                                                                            } else {
                                                                                nb_haemorrhagic_model3 = 0.27;
                                                                            }
                                                                        } else {
                                                                            nb_haemorrhagic_model3 = 0.18;
                                                                        }
                                                                    }
                                                                } else {
                                                                    nb_haemorrhagic_model3 = 0.11;
                                                                }
                                                            } else {
                                                                nb_haemorrhagic_model3 = 0.26;
                                                            }
                                                        } else {
                                                            nb_haemorrhagic_model3 = 0.08;
                                                        }
                                                    } else {
                                                        nb_haemorrhagic_model3 = 0.26;
                                                    }
                                                } else {
                                                    nb_haemorrhagic_model3 = 0.12;
                                                }
                                            } else {
                                                nb_haemorrhagic_model3 = 0.12;
                                            }
                                        } else {
                                            nb_haemorrhagic_model3 = 0.13;
                                        }
                                    } else {
                                        nb_haemorrhagic_model3 = 0.15;
                                    }
                                } else {
                                    nb_haemorrhagic_model3 = 0.15;
                                }
                            } else {
                                nb_haemorrhagic_model3 = 0.17;
                            }
                        } else {
                            if (eyemovemt == 0) {
                                if (dysarthria == 0) {
                                    if (mentalstate == 0) {
                                        nb_haemorrhagic_model3 = 0.01;
                                    } else {
                                        nb_haemorrhagic_model3 = 0.37;
                                    }
                                } else {
                                    if (vomit == 0) {
                                        nb_haemorrhagic_model3 = 0.04;
                                    } else {
                                        nb_haemorrhagic_model3 = 0.25;
                                    }
                                }
                            } else {
                                nb_haemorrhagic_model3 = 0.16;
                            }
                        }

                        //Naive Bayes model 4 of stroke mimics classification;
                        if (loc == 0) {
                            if (other == 0) {
                                if (speechloss == 0) {
                                    if (gsensepos == 0) {
                                        if (gsignpos == 0) {
                                            if (headace == 0) {
                                                nb_mimics_model4 = 0.83;
                                            } else {
                                                if (ataxia == 0) {
                                                    if (vision == 0) {
                                                        if (seizure == 0) {
                                                            nb_mimics_model4 = 0.71;
                                                        } else {
                                                            nb_mimics_model4 = 0.86;
                                                        }
                                                    } else {
                                                        nb_mimics_model4 = 0.83;
                                                    }
                                                } else {
                                                    nb_mimics_model4 = 0.71;
                                                }
                                            }
                                        } else {
                                            if (headace == 0) {
                                                if (mentalstate == 0) {
                                                    if (gmotorpos == 0) {
                                                        nb_mimics_model4 = 0.94;
                                                    } else {
                                                        if (seizure == 0) {
                                                            nb_mimics_model4 = 0.65;
                                                        } else {
                                                            nb_mimics_model4 = 0.86;
                                                        }
                                                    }
                                                } else {
                                                    nb_mimics_model4 = 0.32;
                                                }
                                            } else {
                                                if (gotherpos == 0) {
                                                    nb_mimics_model4 = 0.65;
                                                } else {
                                                    nb_mimics_model4 = 0.6;
                                                }
                                            }
                                        }
                                    } else {
                                        if (vision == 0) {
                                            nb_mimics_model4 = 0.74;
                                        } else {
                                            nb_mimics_model4 = 0.85;
                                        }
                                    }
                                } else {
                                    if (vomit == 0) {
                                        if (gabngcs == 0) {
                                            if (focalweek == 0) {
                                                nb_mimics_model4 = 0.75;
                                            } else {
                                                nb_mimics_model4 = 0.29;
                                            }
                                        } else {
                                            nb_mimics_model4 = 0.37;
                                        }
                                    } else {
                                        nb_mimics_model4 = 0.65;
                                    }
                                }
                            } else {
                                if (vomit == 0) {
                                    if (headace == 0) {
                                        nb_mimics_model4 = 0.91;
                                    } else {
                                        nb_mimics_model4 = 0.93;
                                    }
                                } else {
                                    nb_mimics_model4 = 0.85;
                                }
                            }
                        } else {
                            if (headace == 0) {
                                nb_mimics_model4 = 0.67;
                            } else {
                                nb_mimics_model4 = 0.561;
                            }
                        }

                        //Naive Bayes model 4 of ischaemic stroke clssification;
                        if (gsignpos == 0) {
                            if (vomit == 0) {
                                if (headace == 0) {
                                    nb_ischaemic_model4 = 0.07;
                                } else {
                                    nb_ischaemic_model4 = 0.03;
                                }
                            } else {
                                nb_ischaemic_model4 = 0.03;
                            }
                        } else {
                            if (gabngcs == 0) {
                                if (ataxia == 0) {
                                    if (dizziness == 0) {
                                        if (other == 0) {
                                            if (gsensepos == 0) {
                                                if (vision == 0) {
                                                    if (gotherpos == 0) {
                                                        if (focalnumb == 0) {
                                                            if (speechloss == 0) {
                                                                nb_ischaemic_model4 = 0;
                                                            } else {
                                                                nb_ischaemic_model4 = 0.71;
                                                            }
                                                        } else {
                                                            nb_ischaemic_model4 = 0.59;
                                                        }
                                                    } else {
                                                        nb_ischaemic_model4 = 0.5;
                                                    }
                                                } else {
                                                    nb_ischaemic_model4 = 0.13;
                                                }
                                            } else {
                                                nb_ischaemic_model4 = 0.3;
                                            }
                                        } else {
                                            nb_ischaemic_model4 = 0.04;
                                        }
                                    } else {
                                        nb_ischaemic_model4 = 0.26;
                                    }
                                } else {
                                    if (vomit == 0) {
                                        nb_ischaemic_model4 = 0.21;
                                    } else {
                                        nb_ischaemic_model4 = 0.2;
                                    }
                                }
                            } else {
                                if (vision == 0) {
                                    if (seizure == 0) {
                                        if (gotherpos == 0) {
                                            nb_ischaemic_model4 = 0.39;
                                        } else {
                                            nb_ischaemic_model4 = 0.19;
                                        }
                                    } else {
                                        nb_ischaemic_model4 = 0.26;
                                    }
                                } else {
                                    nb_ischaemic_model4 = 0.27;
                                }
                            }
                        }

                        // Naive Bayes model4 of haemorrhagic stroke classifiction
                        if (seizure == 0) {
                            if (gsensepos == 0) {
                                if (focalweek == 0) {
                                    if (gotherpos == 0) {
                                        if (vertigo == 0) {
                                            if (focalnumb == 0) {
                                                if (speechloss == 0) {
                                                    if (gmotorpos == 0) {
                                                        if (loc == 0) {
                                                            if (vision == 0) {
                                                                if (other == 0) {
                                                                    nb_haemorrhagic_model4 = 0.33;
                                                                } else {
                                                                    nb_haemorrhagic_model4 = 0.14;
                                                                }
                                                            } else {
                                                                nb_haemorrhagic_model4 = 0.09;
                                                            }
                                                        } else {
                                                            nb_haemorrhagic_model4 = 0.46;
                                                        }
                                                    } else {
                                                        nb_haemorrhagic_model4 = 0.14;
                                                    }
                                                } else {
                                                    nb_haemorrhagic_model4 = 0.25;
                                                }
                                            } else {
                                                nb_haemorrhagic_model4 = 0.07;
                                            }
                                        } else {
                                            nb_haemorrhagic_model4 = 0.14;
                                        }
                                    } else {
                                        if (mentalstate == 0) {
                                            if (headace == 0) {
                                                nb_haemorrhagic_model4 = 0.06;
                                            } else {
                                                nb_haemorrhagic_model4 = 0.23;
                                            }
                                        } else {
                                            nb_haemorrhagic_model4 = 0.25;
                                        }
                                    }
                                } else {
                                    if (speechloss == 0) {
                                        if (other == 0) {
                                            if (focalnumb == 0) {
                                                if (headace == 0) {
                                                    nb_haemorrhagic_model4 = 0.06;
                                                } else {
                                                    nb_haemorrhagic_model4 = 0.26;
                                                }
                                            } else {
                                                nb_haemorrhagic_model4 = 0.18;
                                            }
                                        } else {
                                            nb_haemorrhagic_model4 = 0.14;
                                        }
                                    } else {
                                        nb_haemorrhagic_model4 = 0.05;
                                    }
                                }
                            } else {
                                if (vomit == 0) {
                                    nb_haemorrhagic_model4 = 0.04;
                                } else {
                                    nb_haemorrhagic_model4 = 0.08;
                                }
                            }
                        } else {
                            if (headace == 0) {
                                if (focalweek == 0) {
                                    nb_haemorrhagic_model4 = 0.13;
                                } else {
                                    nb_haemorrhagic_model4 = 0.13;
                                }
                            } else {
                                nb_haemorrhagic_model4 = 0.2;
                            }
                        }

                        //Naive Model5 of stroke mimics classification;
                        if (gmotorpos == 0) {
                            if (gspeechpos == 0) {
                                nb_mimics_model5 = 0.8;
                            } else {
                                nb_mimics_model5 = 0.54;
                            }
                        } else {
                            if (gsignpos == 0) {
                                nb_mimics_model5 = 0.88;
                            } else {
                                if (weakleg == 0) {
                                    if (gspeechpos == 0) {
                                        if (weakarm == 0) {
                                            nb_mimics_model5 = 0.91;
                                        } else {
                                            nb_mimics_model5 = 0.65;
                                        }
                                    } else {
                                        if (dysarthria == 0) {
                                            if (weakarm == 0) {
                                                nb_mimics_model5 = 0.94;
                                            } else {
                                                if (weakface == 0) {
                                                    nb_mimics_model5 = 0.74;
                                                } else {
                                                    nb_mimics_model5 = .21;
                                                }
                                            }
                                        } else {
                                            nb_mimics_model5 = 0.22;
                                        }
                                    }
                                }
                            }
                        }

                        //Naive Model 5 of ischaemic stroke classification
                        if (gmotorpos == 0) {
                            if (gsignpos == 0) {
                                nb_ischaemic_model5 = 0.02;
                            } else {
                                if (dysarthria == 0) {
                                    nb_mimics_model5 = 0.03;
                                } else {
                                    nb_mimics_model5 = 0.3;
                                }
                            }
                        } else {
                            if (weakarm == 0) {
                                if (weakface == 0) {
                                    nb_mimics_model5 = 0.03;
                                } else {
                                    if (dysarthria == 0) {
                                        nb_mimics_model5 = 0.09;
                                    } else {
                                        nb_mimics_model5 = 0.54;
                                    }
                                }
                            } else {
                                if (gspeechpos == 0) {
                                    if (weakleg == 0) {
                                        nb_mimics_model5 = 0.28;
                                    } else {
                                        if (weakhand == 0) {
                                            nb_mimics_model5 = 0.23;
                                        } else {
                                            if (weakface == 0) {
                                                nb_mimics_model5 = 0.29;
                                            } else {
                                                nb_mimics_model5 = 0.72;
                                            }
                                        }
                                    }
                                } else {
                                    if (weakface == 0) {
                                        nb_mimics_model5 = 0.25;
                                    } else {
                                        nb_mimics_model5 = 0.77;
                                    }
                                }
                            }
                        }

                        // Naive Bayes model5 of haemorrhagic stroke classification: NA
                        // Naive Bayes model6 of stroke mimics classification
                        if (weakarm == 0) {
                            if (gspeechpos == 0) {
                                if (vertigo == 0) {
                                    if (glowgcs == 0) {
                                        nb_mimics_model6 = 0.87;
                                    } else {
                                        nb_mimics_model6 = 0.32;
                                    }
                                } else {
                                    nb_mimics_model6 = 0.89;
                                }
                            } else {
                                nb_mimics_model6 = 0.62;
                            }
                        } else {
                            if (vertigo == 0) {
                                if (dysarthria == 0) {
                                    if (senseneg == 0) {
                                        if (weakhand == 0) {
                                            nb_mimics_model6 = 0.76;
                                        } else {
                                            if (glowgcs == 0) {
                                                if (weakleg == 0) {
                                                    nb_mimics_model6 = 0.64;
                                                } else {
                                                    if (weakface == 0) {
                                                        nb_mimics_model6 = 0.66;
                                                    } else {
                                                        nb_mimics_model6 = 0.22;
                                                    }
                                                }
                                            } else {
                                                nb_mimics_model6 = 0.25;
                                            }
                                        }
                                    } else {
                                        nb_mimics_model6 = 0.25;
                                    }
                                } else {
                                    nb_mimics_model6 = 0.17;
                                }
                            } else {
                                nb_mimics_model6 = 0.78;
                            }
                        }

                        //Naive Bayes model6 of haemorrhagic stroke classification;
                        if (gspeechpos == 0) {
                            if (weakhand == 0) {
                                if (vertigo == 0) {
                                    if (weakarm == 0) {
                                        if (glowgcs == 0) {
                                            nb_haemorrhagic_model6 = 0.09;
                                        } else {
                                            nb_haemorrhagic_model6 = 0.68;
                                        }
                                    } else {
                                        nb_haemorrhagic_model6 = 0.06;
                                    }
                                } else {
                                    nb_haemorrhagic_model6 = 0.11;
                                }
                            } else {
                                if (vertigo == 0) {
                                    if (weakleg == 0) {
                                        nb_haemorrhagic_model6 = 0.16;
                                    } else {
                                        if (weakarm == 0) {
                                            nb_haemorrhagic_model6 = 0.25;
                                        } else {
                                            nb_haemorrhagic_model6 = 0.12;
                                        }
                                    }
                                } else {
                                    nb_haemorrhagic_model6 = 0.25;
                                }
                            }
                        } else {
                            if (vertigo == 0) {
                                if (weakhand == 0) {
                                    nb_haemorrhagic_model6 = 0.13;
                                } else {
                                    nb_haemorrhagic_model6 = 0.13;
                                }
                            } else {
                                nb_haemorrhagic_model6 = 0.2;
                            }
                        }

                        //Naive Bayes model of ischaemic stroke classification;
                        if (weakhand == 0) {
                            if (dysphasia == 0) {
                                if (gspeechpos == 0) {
                                    if (vertigo == 0) {
                                        if (glowgcs == 0) {
                                            if (weakarm == 0) {
                                                nb_ischaemic_mode6 = 0.04;
                                            } else {
                                                nb_ischaemic_mode6 = 0.28;
                                            }
                                        } else {
                                            nb_ischaemic_mode6 = 0.05;
                                        }
                                    } else {
                                        nb_ischaemic_mode6 = 0.11;
                                    }
                                } else {
                                    nb_ischaemic_mode6 = 0.28;
                                }
                            } else {
                                nb_ischaemic_mode6 = 0.33;
                            }
                        } else {
                            if (vertigo == 0) {
                                if (weakleg == 0) {
                                    nb_ischaemic_mode6 = 0.33;
                                } else {
                                    if (senseneg == 0) {
                                        if (dysarthria == 0) {
                                            if (weakarm == 0) {
                                                nb_ischaemic_mode6 = 0.25;
                                            } else {
                                                if (glowgcs == 0) {
                                                    if (weakface == 0) {
                                                        nb_ischaemic_mode6 = 0.29;
                                                    } else {
                                                        nb_ischaemic_mode6 = 0.74;
                                                    }
                                                } else {
                                                    nb_ischaemic_mode6 = 0.23;
                                                }
                                            }
                                        } else {
                                            nb_ischaemic_mode6 = 0.77;
                                        }
                                    } else {
                                        nb_ischaemic_mode6 = 0.71;
                                    }
                                }
                            } else {
                                nb_ischaemic_mode6 = 0.21;
                            }
                        }

                        // probability calculator of stroke mimics in ensemble model
                        if (nb_mimics_model6 < 0.47) {
                            if (nb_mimics_model3 < 0.49) {
                                buckets_mimics_cart = 0;
                            } else {
                                if (cart_haemorrhagic_model1 >= 0.025) {
                                    buckets_mimics_cart = 0.17;
                                } else {
                                    buckets_mimics_cart = 0.78;
                                }
                            }
                        } else {
                            if (nb_ischaemic_model1 >= 0.46) {
                                buckets_mimics_cart = 0.18;
                            } else {
                                if (nb_mimics_model4 < 0.84) {
                                    if (cart_haemorrhagic_model2 >= 0.04) {
                                        if (nb_mimics_model2 < 0.57) {
                                            buckets_mimics_cart = 0.23;
                                        } else {
                                            buckets_mimics_cart = 0.74;
                                        }
                                    } else {
                                        buckets_mimics_cart = 0.91;
                                    }
                                } else {
                                    buckets_mimics_cart = 0.98;
                                }
                            }
                        }

                        // probability calculator of ischaemic stroke in ensemble model
                        if (cart_ischaemic_model3 < 0.28) {
                            if (nb_ischaemic_model1 < 0.5) {
                                buckets_ischaemic_cart = 0.05;
                            } else {
                                buckets_ischaemic_cart = 0.67;
                            }
                        } else {
                            if (nb_ischaemic_model4 < 0.2) {
                                buckets_ischaemic_cart = 0.12;
                            } else {
                                if (nb_mimics_model2 > 0.48) {
                                    if (cart_ischaemic_model2 < 0.58) {
                                        if (nb_mimics_model6 >= 0.23) {
                                            buckets_ischaemic_cart = 0.29;
                                        } else {
                                            buckets_ischaemic_cart = 0.81;
                                        }
                                    } else {
                                        buckets_ischaemic_cart = 1;
                                    }
                                } else {
                                    buckets_ischaemic_cart = 1;
                                }
                            }
                        }

                        //probability calculator of haemorrhagic stroke in ensemble model
                        if (cart_haemorrhagic_model2 < 0.04) {
                            buckets_haemorrhagic_cart = 0.01;
                        } else {
                            if (nb_haemorrhagic_model4 < 0.22) {
                                buckets_haemorrhagic_cart = 0.11;
                            } else {
                                if (nb_mimics_model2 >= 0.44) {
                                    buckets_ischaemic_cart = 0.36;
                                } else {
                                    buckets_ischaemic_cart = 1;
                                }
                            }
                        }

                        //probability calculator of stroke mimics in cart ensemble model
                        if (nb_mimics_model6 < 0.47) {
                            if (nb_mimics_model3 < 0.49) {
                                stacking_mimics_cart = 0;
                            } else {
                                if (nb_mimics_model2 < 0.64) {
                                    stacking_mimics_cart = 0.16;
                                } else {
                                    stacking_mimics_cart = 0.62;
                                }
                            }
                        } else {
                            if (nb_mimics_model4 < 0.84) {
                                if (nb_mimics_model3 < 0.49) {
                                    stacking_mimics_cart = 0.33;
                                } else {
                                    if (cart_mimics_model1 >= 0.27) {
                                        if (nb_mimics_model2 < 0.55) {
                                            stacking_mimics_cart = 0.38;
                                        } else {
                                            stacking_mimics_cart = 0.76;
                                        }
                                    } else {
                                        stacking_mimics_cart = 0.9;
                                    }
                                }
                            } else {
                                stacking_mimics_cart = 0.98;
                            }
                        }

                        //probability calculator of ischaemic stroke in cart ensemble model
                        if (cart_ischaemic_model3 < 0.28) {
                            if (nb_ischaemic_model1 < 0.5) {
                                stacking_ischaemic_cart = 0.05;
                            } else {
                                stacking_ischaemic_cart = 0.67;
                            }
                        } else {
                            if (nb_ischaemic_model4 < 0.2) {
                                stacking_ischaemic_cart = 0.12;
                            } else {
                                stacking_ischaemic_cart = 0.82;
                            }
                        }

                        //probability calculator of haemorrhagic stroke in cart ensemble model (stacking)
                        if (cart_haemorrhagic_model2 < 0.04) {
                            stacking_haemorrhagic_cart = 0.01;
                        } else {
                            if (nb_haemorrhagic_model4 < 0.22) {
                                stacking_haemorrhagic_cart = 0.11;
                            } else {
                                if (nb_haemorrhagic_model2 < 0.3) {
                                    stacking_haemorrhagic_cart = 0.47;
                                } else {
                                    stacking_haemorrhagic_cart = 1;
                                }
                            }
                        }

                        //probability calculator of stroke mimics stroke in nb ensemble model (bucket)
                        if (nb_mimics_model4 == 0.29) {
                            buckets_mimics_nb = 0.29;
                        } else {
                            if (nb_mimics_model4 == 0.32) {
                                buckets_mimics_nb = 0.3;
                            } else {
                                if (nb_mimics_model4 == 0.37) {
                                    buckets_mimics_nb = 0.33;
                                } else {
                                    if (nb_mimics_model4 == 0.6) {
                                        buckets_mimics_nb = 0.61;
                                    } else {
                                        if (nb_mimics_model4 == 0.66 && cart_mimics_model3 == 0.19) {
                                            buckets_mimics_nb = 0.76;
                                        } else {
                                            if (nb_mimics_model4 == 0.66 && cart_mimics_model3 == 0.25) {
                                                buckets_mimics_nb = 0.5;
                                            } else {
                                                if (nb_mimics_model4 == 0.66 && cart_mimics_model3 == 0.29) {
                                                    buckets_mimics_nb = 0.28;
                                                } else {
                                                    if (nb_mimics_model4 == 0.66 && cart_mimics_model3 == 0.59) {
                                                        buckets_mimics_nb = 0.95;
                                                    } else {
                                                        if (nb_mimics_model4 == 0.66 && cart_mimics_model3 == 0.84) {
                                                            buckets_mimics_nb = 0.5;
                                                        } else {
                                                            if (nb_mimics_model4 == 0.66 && cart_mimics_model3 == 0.93) {
                                                                buckets_mimics_nb = 0.5;
                                                            } else {
                                                                if (nb_mimics_model4 == 0.66 && cart_mimics_model3 == 1) {
                                                                    buckets_mimics_nb = 0.5;
                                                                } else {
                                                                    if (nb_mimics_model4 == 0.67) {
                                                                        buckets_mimics_nb = 0.67;
                                                                    } else {
                                                                        if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.05) {
                                                                            buckets_mimics_nb = 0.5;
                                                                        } else {
                                                                            if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.14) {
                                                                                buckets_mimics_nb = 0.5;
                                                                            } else {
                                                                                if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.24) {
                                                                                    buckets_mimics_nb = 0.5;
                                                                                } else {
                                                                                    if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.3) {
                                                                                        buckets_mimics_nb = 0.5;
                                                                                    } else {
                                                                                        if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.45) {
                                                                                            buckets_mimics_nb = 0.25;
                                                                                        } else {
                                                                                            if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.54) {
                                                                                                buckets_mimics_nb = 0.5;
                                                                                            } else {
                                                                                                if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.56) {
                                                                                                    buckets_mimics_nb = 0.5;
                                                                                                } else {
                                                                                                    if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.61) {
                                                                                                        buckets_mimics_nb = 0.5;
                                                                                                    } else {
                                                                                                        if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.69) {
                                                                                                            buckets_mimics_nb = 0.5;
                                                                                                        } else {
                                                                                                            if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.72) {
                                                                                                                buckets_mimics_nb = 0.5;
                                                                                                            } else {
                                                                                                                if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.74) {
                                                                                                                    buckets_mimics_nb = 0.5;
                                                                                                                } else {
                                                                                                                    if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.75) {
                                                                                                                        buckets_mimics_nb = 0.5;
                                                                                                                    } else {
                                                                                                                        if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.78) {
                                                                                                                            buckets_mimics_nb = 0.77;
                                                                                                                        } else {
                                                                                                                            if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.82) {
                                                                                                                                buckets_mimics_nb = 0.5;
                                                                                                                            } else {
                                                                                                                                if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.83) {
                                                                                                                                    buckets_mimics_nb = 0.5;
                                                                                                                                } else {
                                                                                                                                    if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.88) {
                                                                                                                                        buckets_mimics_nb = 0.5;
                                                                                                                                    } else {
                                                                                                                                        if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.89) {
                                                                                                                                            buckets_mimics_nb = 0.5;
                                                                                                                                        } else {
                                                                                                                                            if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.9) {
                                                                                                                                                buckets_mimics_nb = 0.71;
                                                                                                                                            } else {
                                                                                                                                                if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.91) {
                                                                                                                                                    buckets_mimics_nb = 0.5;
                                                                                                                                                } else {
                                                                                                                                                    if (nb_mimics_model4 == 0.71 && nb_mimics_model3 == 0.93) {
                                                                                                                                                        buckets_mimics_nb = 0.5;
                                                                                                                                                    } else {
                                                                                                                                                        if (nb_mimics_model4 == 0.74) {
                                                                                                                                                            buckets_mimics_nb = 0.74;
                                                                                                                                                        } else {
                                                                                                                                                            if (nb_mimics_model4 == 0.75) {
                                                                                                                                                                buckets_mimics_nb = 0.75;
                                                                                                                                                            } else {
                                                                                                                                                                if (nb_mimics_model4 == 0.83) {
                                                                                                                                                                    buckets_mimics_nb = 0.85;
                                                                                                                                                                } else {
                                                                                                                                                                    if (nb_mimics_model4 == 0.85) {
                                                                                                                                                                        buckets_mimics_nb = 0.87;
                                                                                                                                                                    } else {
                                                                                                                                                                        if (nb_mimics_model4 == 0.86) {
                                                                                                                                                                            buckets_mimics_nb = 0.92;
                                                                                                                                                                        } else {
                                                                                                                                                                            if (nb_mimics_model4 == 0.91) {
                                                                                                                                                                                buckets_mimics_nb = 0.92;
                                                                                                                                                                            } else {
                                                                                                                                                                                if (nb_mimics_model4 == 0.93) {
                                                                                                                                                                                    buckets_mimics_nb = 0.93;
                                                                                                                                                                                } else {
                                                                                                                                                                                    if (nb_mimics_model4 == 0.94) {
                                                                                                                                                                                        buckets_mimics_nb = 0.93;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }

                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

//probability calculator of ischaemic stroke in nb ensemble model (bucket)
if(nb_haemorrhagic_model4==0.04 && cart_haemorrhagic_model3 == 0){
    buckets_ischaemic_nb = 0.4;
}else {
    if (nb_haemorrhagic_model4 == 0.04 && cart_haemorrhagic_model3 == 0.04) {
        buckets_ischaemic_nb = 0.24;
    } else {
        if (nb_haemorrhagic_model4 == 0.04 && cart_haemorrhagic_model3 == 0.18) {
            buckets_ischaemic_nb = 0.5;
        } else {
            if (nb_haemorrhagic_model4 == 0.04 && cart_haemorrhagic_model3 == 0.55) {
                buckets_ischaemic_nb = 0.33;
            } else {
                if (nb_haemorrhagic_model4 == 0.04 && cart_haemorrhagic_model3 == 0.93) {
                    buckets_ischaemic_nb = 0.12;
                } else {
                    if (nb_haemorrhagic_model4 == 0.05 && cart_haemorrhagic_model3 == 0) {
                        buckets_ischaemic_nb = 0.56;
                    } else {
                        if (nb_haemorrhagic_model4 == 0.04 && cart_haemorrhagic_model3 == 0.04) {
                            buckets_ischaemic_nb = 0.27;
                        } else {
                            if (nb_haemorrhagic_model4 == 0.04 && cart_haemorrhagic_model3 == 0.18) {
                                buckets_ischaemic_nb = 0.5;
                            } else {
                                if (nb_haemorrhagic_model4 == 0.04 && cart_haemorrhagic_model3 == 0.55) {
                                    buckets_ischaemic_nb = 0.5;
                                } else {
                                    if (nb_haemorrhagic_model4 == 0.04 && cart_haemorrhagic_model3 == 0.93) {
                                        buckets_ischaemic_nb = 0.5;
                                    } else {
                                        if (nb_haemorrhagic_model4 == 0.06 && cart_haemorrhagic_model3 == 0 && cart_mimics_model3 == 0.19) {
                                            buckets_ischaemic_nb = 0.14;
                                        } else {
                                            if (nb_haemorrhagic_model4 == 0.06 && cart_haemorrhagic_model3 == 0 && cart_mimics_model3 == 0.25) {
                                                buckets_ischaemic_nb = 0.5;
                                            } else {
                                                if (nb_haemorrhagic_model4 == 0.06 && cart_haemorrhagic_model3 == 0 && cart_mimics_model3 == 0.29) {
                                                    buckets_ischaemic_nb = 0.75;
                                                } else {
                                                    if (nb_haemorrhagic_model4 == 0.06 && cart_haemorrhagic_model3 == 0 && cart_mimics_model3 == 0.59) {
                                                        buckets_ischaemic_nb = 0.06;
                                                    } else {
                                                        if (nb_haemorrhagic_model4 == 0.06 && cart_haemorrhagic_model3 == 0 && cart_mimics_model3 == 0.84) {
                                                            buckets_ischaemic_nb = 0.5;
                                                        } else {
                                                            if (nb_haemorrhagic_model4 == 0.06 && cart_haemorrhagic_model3 == 0 && cart_mimics_model3 == 0.93) {
                                                                buckets_ischaemic_nb = 0.5;
                                                            } else {
                                                                if (nb_haemorrhagic_model4 == 0.06 && cart_haemorrhagic_model3 == 0 && cart_mimics_model3 == 1) {
                                                                    buckets_ischaemic_nb = 0.5;
                                                                } else {
                                                                    if (nb_haemorrhagic_model4 == 0.06 && cart_haemorrhagic_model3 == 0.04) {
                                                                        buckets_ischaemic_nb = 0.5;
                                                                    } else {
                                                                        if (nb_haemorrhagic_model4 == 0.06 && cart_haemorrhagic_model3 == 0.18) {
                                                                            buckets_ischaemic_nb = 0.5;
                                                                        } else {
                                                                            if (nb_haemorrhagic_model4 == 0.06 && cart_haemorrhagic_model3 == 0.55) {
                                                                                buckets_ischaemic_nb = 0.33;
                                                                            } else {
                                                                                if (nb_haemorrhagic_model4 == 0.06 && cart_haemorrhagic_model3 == 0.93) {
                                                                                    buckets_ischaemic_nb = 0.07;
                                                                                } else {
                                                                                    if (nb_haemorrhagic_model4 == 0.07) {
                                                                                        buckets_ischaemic_nb = 0.21;
                                                                                    } else {
                                                                                        if (nb_haemorrhagic_model4 == 0.08) {
                                                                                            buckets_ischaemic_nb = 0.25;
                                                                                        } else {
                                                                                            if (nb_haemorrhagic_model4 == 0.09) {
                                                                                                buckets_ischaemic_nb = 0.04;
                                                                                            } else {
                                                                                                if (nb_haemorrhagic_model4 == 0.13) {
                                                                                                    buckets_ischaemic_nb = 0.14;
                                                                                                } else {
                                                                                                    if (nb_haemorrhagic_model4 == 0.14) {
                                                                                                        buckets_ischaemic_nb = 0.03;
                                                                                                    } else {
                                                                                                        if (nb_haemorrhagic_model4 == 0.18) {
                                                                                                            buckets_ischaemic_nb = 0.27;
                                                                                                        } else {
                                                                                                            if (nb_haemorrhagic_model4 == 0.2) {
                                                                                                                buckets_ischaemic_nb = 0.24;
                                                                                                            } else {
                                                                                                                if (nb_haemorrhagic_model4 == 0.23) {
                                                                                                                    buckets_ischaemic_nb = 0.19;
                                                                                                                } else {
                                                                                                                    if (nb_haemorrhagic_model4 == 0.25) {
                                                                                                                        buckets_ischaemic_nb = 0.15;
                                                                                                                    } else {
                                                                                                                        if (nb_haemorrhagic_model4 == 0.26) {
                                                                                                                            buckets_ischaemic_nb = 0.13;
                                                                                                                        } else {
                                                                                                                            if (nb_haemorrhagic_model4 == 0.33) {
                                                                                                                                buckets_ischaemic_nb = 0.07;
                                                                                                                            } else {
                                                                                                                                if (nb_haemorrhagic_model4 == 0.46) {
                                                                                                                                    buckets_ischaemic_nb = 0.06;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

//probability calculator of haemorrhagic stroke in nb ensemble model (bucket)
if(nb_haemorrhagic_model3 == 0.01){
    buckets_haemorrhagic_nb = 0.01;
}else{
    if(nb_haemorrhagic_model3 == 0.04){
        buckets_haemorrhagic_nb = 0.04;
    }else{
        if(nb_haemorrhagic_model3 == 0.08){
            buckets_haemorrhagic_nb = 0.06;
        }else{
            if(nb_haemorrhagic_model3 == 0.11){
                buckets_haemorrhagic_nb = 0.11;
            }else{
                if(nb_haemorrhagic_model3 == 0.12){
                    buckets_haemorrhagic_nb = 0.13;
                }else{
                    if(nb_haemorrhagic_model3 == 0.13){
                        buckets_haemorrhagic_nb = 0.12;
                    }else{
                        if(nb_haemorrhagic_model3 == 0.16){
                            buckets_haemorrhagic_nb = 0.15;
                        }else{
                            if(nb_haemorrhagic_model3 == 0.17){
                                buckets_haemorrhagic_nb =0.17;
                            }else{
                                if(nb_haemorrhagic_model3 == 0.18){
                                    buckets_haemorrhagic_nb = 0.18;
                                }else{
                                    if(nb_haemorrhagic_model3 == 0.19){
                                        buckets_haemorrhagic_nb = 0.2;
                                    }else{
                                        if(nb_haemorrhagic_model3 == 0.25){
                                            buckets_haemorrhagic_nb = 0.25;
                                        }else{
                                            if(nb_haemorrhagic_model3 == 0.26){
                                                buckets_haemorrhagic_nb = 0.22;
                                            }else{
                                                if(nb_haemorrhagic_model3 == 0.27){
                                                    buckets_haemorrhagic_nb = 0.27;
                                                }else{
                                                    if(nb_haemorrhagic_model3 == 0.37){
                                                        buckets_haemorrhagic_nb = 0.38;
                                                    }else{
                                                        if(nb_haemorrhagic_model3==0.39){
                                                            buckets_haemorrhagic_nb = 0.38;
                                                        }else{
                                                            if(nb_haemorrhagic_model3==0.15 && cart_haemorrhagic_model1 ==0 ){
                                                                buckets_haemorrhagic_nb = 0.15;
                                                            }else{
                                                                if(nb_haemorrhagic_model3==0.15 && cart_haemorrhagic_model1 ==0.05){
                                                                    buckets_haemorrhagic_nb = 0.13;
                                                                }else{
                                                                    if(nb_haemorrhagic_model3==0.15 && cart_haemorrhagic_model1 ==0.13){
                                                                        buckets_haemorrhagic_nb = 0.33;
                                                                    }else{
                                                                        if(nb_haemorrhagic_model3==0.15 && cart_haemorrhagic_model1 ==0.2){
                                                                            buckets_haemorrhagic_nb = 0.5;
                                                                        }else{
                                                                            if(nb_haemorrhagic_model3==0.15 && cart_haemorrhagic_model1 ==0.53){
                                                                                buckets_haemorrhagic_nb = 0.38;
                                                                            }else{
                                                                                if(nb_haemorrhagic_model3==0.15 && cart_haemorrhagic_model1 ==0.57){
                                                                                    buckets_haemorrhagic_nb = 0.33;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


 // probability calculator of stroke mimics in nb ensemble model (stacking)
   if(nb_mimics_model4 == 0.29) {
       stacking_mimics_nb = 0.29;
   } else {
       if (nb_mimics_model4 == 0.32){
           stacking_mimics_nb = 0.3;
       }else {
           if (nb_mimics_model4 == 0.37){
               stacking_mimics_nb = 0.33;
           }else {
               if (nb_mimics_model4 == 0.6) {
                   stacking_mimics_nb = 0.61;
               } else {
                   if (nb_mimics_model4 == 0.61) {
                       stacking_mimics_nb = 0.61;
                   } else {
                       if (nb_mimics_model4 == 0.65 && cart_mimics_model3 == 0.19) {
                           stacking_mimics_nb = 0.76;
                       } else {
                           if (nb_mimics_model4 == 0.65 && cart_mimics_model3 == 0.25) {
                               stacking_mimics_nb = 0.5;
                           } else {
                               if (nb_mimics_model4 == 0.65 && cart_mimics_model3 == 0.29) {
                                   stacking_mimics_nb = 0.28;
                               } else {
                                   if (nb_mimics_model4 == 0.65 && cart_mimics_model3 == 0.59) {
                                       stacking_mimics_nb = 0.95;
                                   } else {
                                       if (nb_mimics_model4 == 0.65 && cart_mimics_model3 == 0.84) {
                                           stacking_mimics_nb = 0.5;
                                       } else {
                                           if (nb_mimics_model4 == 0.65 && cart_mimics_model3 == 0.93) {
                                               stacking_mimics_nb = 0.5;
                                           } else {
                                               if (nb_mimics_model4 == 0.65 && cart_mimics_model3 == 0.1) {
                                                   stacking_mimics_nb = 0.5;
                                               } else {
                                                   if (nb_mimics_model4 == 0.67) {
                                                       stacking_mimics_nb = 0.67;
                                                   } else {
                                                       if (nb_mimics_model4 == 0.71) {
                                                           stacking_mimics_nb = 0.73;
                                                       } else {
                                                           if (nb_mimics_model4 == 0.74) {
                                                               stacking_mimics_nb = 0.74;
                                                           } else {
                                                               if (nb_mimics_model4 == 0.75) {
                                                                   stacking_mimics_nb = 0.75;
                                                               } else {
                                                                   if (nb_mimics_model4 == 0.83) {
                                                                       stacking_mimics_nb = 0.85;
                                                                   } else {
                                                                       if (nb_mimics_model4 == 0.85) {
                                                                           stacking_mimics_nb = 0.87;
                                                                       } else {
                                                                           if (nb_mimics_model4 == 0.86) {
                                                                               stacking_mimics_nb = 0.92;
                                                                           } else {
                                                                               if (nb_mimics_model4 == 0.91) {
                                                                                   stacking_mimics_nb = 0.92;
                                                                               } else {
                                                                                   if (nb_mimics_model4 == 0.93) {
                                                                                       stacking_mimics_nb = 0.93;
                                                                                   } else {
                                                                                       if (nb_mimics_model4 == 0.94) {
                                                                                           stacking_mimics_nb = 0.93;
                                                                                       }
                                                                                   }
                                                                               }
                                                                           }
                                                                       }
                                                                   }
                                                               }
                                                           }
                                                       }
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                           }
                       }
                   }
               }
           }
       }
   }

                        // probability calculator of ischaemic stroke in nb ensemble model (stacking)

                        if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.02){
                            stacking_ischaemic_nb = 0.02;
                        }else {
                            if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.03) {
                                stacking_ischaemic_nb = 0.03;
                            } else {
                                if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.09 && cart_ischaemic_model4 == 0) {
                                    stacking_ischaemic_nb = 0.09;
                                } else {
                                    if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.09 && cart_ischaemic_model4 == 0.05) {
                                        stacking_ischaemic_nb = 0.09;
                                    } else {
                                        if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.09 && cart_ischaemic_model4 == 0.27) {
                                            stacking_ischaemic_nb = 0.5;
                                        } else {
                                            if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.09 && cart_ischaemic_model4 == 0.37) {
                                                stacking_ischaemic_nb = 0.5;
                                            } else {
                                                if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.09 && cart_ischaemic_model4 == 0.76) {
                                                    stacking_ischaemic_nb = 0.33;
                                                } else {
                                                    if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.23) {
                                                        stacking_ischaemic_nb = 0.5;
                                                    } else {
                                                        if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.25) {
                                                            stacking_ischaemic_nb = 0.5;
                                                        } else {
                                                            if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.28) {
                                                                stacking_ischaemic_nb = 0.5;
                                                            } else {
                                                                if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.29) {
                                                                    stacking_ischaemic_nb = 0.5;
                                                                } else {
                                                                    if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.3) {
                                                                        stacking_ischaemic_nb = 0.3;
                                                                    } else {
                                                                        if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.54) {
                                                                            stacking_ischaemic_nb = 0.56;
                                                                        } else {
                                                                            if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.72) {
                                                                                stacking_ischaemic_nb = 0.5;
                                                                            } else {
                                                                                if (cart_ischaemic_model5 == 0.06 && nb_ischaemic_model5 == 0.77) {
                                                                                    stacking_ischaemic_nb = 0.5;
                                                                                } else {
                                                                                    if (cart_ischaemic_model5 == 0.22) {
                                                                                        stacking_ischaemic_nb = 0.2;
                                                                                    } else {
                                                                                        if (cart_ischaemic_model5 == 0.71 && cart_ischaemic_model3 == 0.04) {
                                                                                            stacking_ischaemic_nb = 0.5;
                                                                                        } else {
                                                                                            if (cart_ischaemic_model5 == 0.71 && cart_ischaemic_model3 == 0.22) {
                                                                                                stacking_ischaemic_nb = 0.5;
                                                                                            } else {
                                                                                                if (cart_ischaemic_model5 == 0.71 && cart_ischaemic_model3 == 0.33) {
                                                                                                    stacking_ischaemic_nb = 0.8;
                                                                                                } else {
                                                                                                    if (cart_ischaemic_model5 == 0.71 && cart_ischaemic_model3 == 0.62) {
                                                                                                        stacking_ischaemic_nb = 0.5;
                                                                                                    } else {
                                                                                                        if (cart_ischaemic_model5 == 0.71 && cart_ischaemic_model3 == 0.81) {
                                                                                                            stacking_ischaemic_nb = 0.38;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }

                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        // probability calculator of haemorrhagic stroke in nb ensemble model (stacking)
                        if(nb_mimics_model4 == 0.29){
                            stacking_haemorrhagic_nb = 0.03;
                        }else{
                            if(nb_mimics_model4 == 0.32){
                                stacking_haemorrhagic_nb = 0.4;
                            }else{
                                if(nb_mimics_model4 == 0.37){
                                    stacking_haemorrhagic_nb = 0.2;
                                }else{
                                    if(nb_mimics_model4 == 0.6){
                                        stacking_haemorrhagic_nb = 0.21;
                                    }else{
                                        if(nb_mimics_model4 == 0.61){
                                            stacking_haemorrhagic_nb = 0.39;
                                        }else{
                                            if(nb_mimics_model4 == 0.65 && cart_mimics_model3 == 0.19){
                                                stacking_haemorrhagic_nb = 0.17;
                                            }else{
                                                if(nb_mimics_model4 == 0.65 && cart_mimics_model3 == 0.25){
                                                    stacking_haemorrhagic_nb = 0.5;
                                                }else{
                                                    if(nb_mimics_model4 == 0.65 && cart_mimics_model3 == 0.29){
                                                        stacking_haemorrhagic_nb = 0.08;
                                                    }else{
                                                        if(nb_mimics_model4 == 0.65 && cart_mimics_model3 == 0.59){
                                                            stacking_haemorrhagic_nb = 0.05;
                                                        }else{
                                                            if(nb_mimics_model4 == 0.65 && cart_mimics_model3 == 0.84){
                                                                stacking_haemorrhagic_nb = 0.5;
                                                            }else{
                                                                if(nb_mimics_model4 == 0.65 && cart_mimics_model3 == 0.93){
                                                                    stacking_haemorrhagic_nb = 0.5;
                                                                }else{
                                                                    if(nb_mimics_model4 == 0.65 && cart_mimics_model3 == 1){
                                                                        stacking_haemorrhagic_nb = 0.5;
                                                                    } else {
                                                                        if (nb_mimics_model4 == 0.67){
                                                                            stacking_haemorrhagic_nb = 0.28;
                                                                        }else{
                                                                            if(nb_mimics_model4 == 0.71){
                                                                                stacking_haemorrhagic_nb = 0.24;
                                                                            }else{
                                                                                if(nb_mimics_model4 == 0.74){
                                                                                    stacking_haemorrhagic_nb = 0.04;
                                                                                }else{
                                                                                    if(nb_mimics_model4 == 0.75){
                                                                                        stacking_haemorrhagic_nb = 0.13;
                                                                                    }else{
                                                                                        if(nb_mimics_model4 ==0.83){
                                                                                            stacking_haemorrhagic_nb = 0.11;
                                                                                        }else{
                                                                                            if(nb_mimics_model4 == 0.85){
                                                                                                stacking_haemorrhagic_nb = 0.11;
                                                                                            }else{
                                                                                                if(nb_mimics_model4 == 0.86){
                                                                                                    stacking_haemorrhagic_nb = 0.08;
                                                                                                }else{
                                                                                                    if(nb_mimics_model4 == 0.91){
                                                                                                        stacking_haemorrhagic_nb = 0.08;
                                                                                                    }else{
                                                                                                        if(nb_mimics_model4 == 0.93){
                                                                                                            stacking_haemorrhagic_nb =0.04;
                                                                                                        }else{
                                                                                                            if(nb_mimics_model4 ==0.94){
                                                                                                                stacking_haemorrhagic_nb = 0.07;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

           //stroke mimics - hybrid model
                        if(buckets_mimics_cart<0.5){
                            if(stacking_mimics_cart<0.35){
                                probability_mimics = 0.02;
                            }else{
                                if(stacking_ischaemic_cart>=0.085){
                                    probability_mimics = 0.25;
                                }else{
                                    probability_mimics = 1;
                                }
                            }
                        }else{
                            if(stacking_mimics_nb<0.9){
                                if(stacking_mimics_cart<0.5){
                                    if(buckets_haemorrhagic_nb>=0.16){
                                        probability_mimics = 0.25;
                                    }else{
                                        probability_mimics = 0.9;
                                    }
                                }else{
                                    if(stacking_haemorrhagic_nb >= 0.11){
                                        if(buckets_ischaemic_nb>=0.065){
                                            if(buckets_haemorrhagic_nb>=0.075){
                                                if(buckets_haemorrhagic_nb>=0.34){
                                                    probability_mimics = 0.57;
                                                }else{
                                                    if(buckets_mimics_nb>=0.73){
                                                        if(buckets_haemorrhagic_cart>=0.17){
                                                            if(stacking_ischaemic_nb>=0.055){
                                                                probability_mimics = 0.4;
                                                            }else{
                                                                probability_mimics =0.7;
                                                            }
                                                        }else{
                                                            probability_mimics =0.81;
                                                        }
                                                    }else{
                                                        probability_mimics =0.94;
                                                    }
                                                }
                                            }else{
                                                probability_mimics =1;
                                            }
                                        }else{
                                            probability_mimics =0.95;
                                        }
                                    }else{
                                        probability_mimics =1;
                                    }
                                }
                            }else{
                                probability_mimics = 1;
                            }
                        }

                    }
                }
            }
        }

        // probability of ischaekmic stroke  - hybrid model
        if(stacking_ischaemic_cart < 0.4){
            if(stacking_mimics_nb>=0.47){
                probability_ischaemic = 0.04;
            }else{
                if(stacking_ischaemic_nb<0.14){
                    probability_ischaemic = 0;
                }else{
                    if(stacking_mimics_cart >=0.5){
                        probability_ischaemic = 0.17;
                    }else{
                        probability_ischaemic =0.6;
                    }
                }
            }
        }else{
            if(buckets_mimics_cart>=0.5){
                probability_ischaemic = 0;
            }else{
                if(stacking_haemorrhagic_nb >= 0.29){
                    probability_ischaemic = 0.38;
                }else{
                    probability_ischaemic =0.92;
                }
            }
        }

        // probability of haemorrhagic stroke  - hybrid model
        if(buckets_haemorrhagic_cart<0.17){
            probability_haemorrhagic = 0.02;
        }else{
            if(buckets_haemorrhagic_cart<0.71){
                if(stacking_haemorrhagic_cart<0.29){
                    probability_haemorrhagic = 0.13;
                }else{
                    if(stacking_mimics_cart>=0.56){
                        probability_haemorrhagic = 0.27;
                    }else{
                        probability_haemorrhagic = 0.8;
                    }
                }
            }else{
                if(buckets_mimics_nb>=0.64){
                    probability_haemorrhagic = 0.4;
                }else{
                    probability_haemorrhagic =1;
                }
            }
        }

        View2.setText("The probability of stroke mimics is " + probability_mimics + "! The probability of ischaemic stroke is " + probability_ischaemic+ "! The probability of haemorrhagic stroke is " + probability_haemorrhagic);
    }
}
