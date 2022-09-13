package com.example.bober;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class avto extends AppCompatActivity {
    int time = 0;
    int k = 31;
    ImageView imageView;
    MediaPlayer mPlayer0;
    MediaPlayer mPlayer;
    MediaPlayer mPlayer1;
    MediaPlayer mPlayer2;
    MediaPlayer mPlayer3;
    MediaPlayer mPlayer4;
    MediaPlayer mPlayer5;
    MediaPlayer mPlayer6;
    MediaPlayer mPlayer7;
    MediaPlayer mPlayer8;
    MediaPlayer mPlayer9;
    MediaPlayer mPlayer10;
    MediaPlayer mPlayer11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPlayer0 = MediaPlayer.create(avto.this, R.raw.rep0);
        mPlayer = MediaPlayer.create(avto.this, R.raw.rep);
        mPlayer1 = MediaPlayer.create(avto.this, R.raw.rep2);
        mPlayer2 = MediaPlayer.create(avto.this, R.raw.rep3);
        mPlayer3 = MediaPlayer.create(avto.this, R.raw.rep4);
        mPlayer4 = MediaPlayer.create(avto.this, R.raw.rep5);
        mPlayer5 = MediaPlayer.create(avto.this, R.raw.rep6);
        mPlayer6 = MediaPlayer.create(avto.this, R.raw.rep7);
        mPlayer7 = MediaPlayer.create(avto.this, R.raw.rep8);
        mPlayer8 = MediaPlayer.create(avto.this, R.raw.rep9);
        mPlayer9 = MediaPlayer.create(avto.this, R.raw.rep10);
        mPlayer10 = MediaPlayer.create(avto.this, R.raw.rep11);
        mPlayer11 = MediaPlayer.create(avto.this, R.raw.rep12);

        setContentView(R.layout.activity_avto);
        Timer timer0 = new Timer();
        Timer timer = new Timer();
        Timer timer1 = new Timer();
        Timer timer2 = new Timer();
        Timer timer3 = new Timer();
        Timer timer4 = new Timer();
        Timer timer5 = new Timer();
        Timer timer6 = new Timer();
        Timer timer7 = new Timer();
        Timer timer8 = new Timer();
        Timer timer9 = new Timer();
        Timer timer10 = new Timer();
        Timer timer11 = new Timer();
        long delay = 15000;
        long period = 15000;
        long delay1 = 15000;
        long period1 = 17000;
        long delay2 = 15000;
        long period2 = 15000;
        long delay3 = 15000;
        long period3 = 15000;
        imageView = findViewById(R.id.prov);
        mPlayer0.start();


        if(k == 31){
            mPlayer.start();
            k-=31;}

        //1
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                time++;
                if (k == 0) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.aehk2sthjhjhgdf);
                            k += 1;
                        }
                    });
                }
                if (k == 1) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.p);

                            k += 1;
                        }
                    });
                }
            }
        }, delay, period);
        //2

        timer1.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                time++;
                if (k == 2) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.gor);
                            k += 1;
                            mPlayer.stop();
                            mPlayer1.start();
                        }
                    });
                }
                if (k == 3) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.ger);

                            k += 1;
                        }
                    });
                }
                if (k == 4) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.gar);

                            k += 1;
                        }
                    });
                }
            }
        }, delay, period);
        //3
        timer2.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                time++;
                if (k == 5) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.third);
                            k += 1;
                            mPlayer1.stop();
                            mPlayer2.start();
                        }
                    });
                }
                if (k == 6) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.thirdq);
                            k += 1;
                        }
                    });
                }
            }
        }, delay2, period2);
        //4
        timer3.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                time++;
                if (k == 7) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.four);
                            k += 1;
                            mPlayer2.stop();
                            mPlayer3.start();
                        }
                    });
                }
                if (k == 8) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.fourq);
                            k += 1;
                        }
                    });
                }
                if (k == 9) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.fourw);
                            k += 1;
                        }
                    });
                }
            }
        }, delay, period);
        //5
        timer4.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                time++;
                if (k == 10) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.five);
                            k += 1;
                            mPlayer3.stop();
                            mPlayer4.start();
                        }
                    });
                }
                if (k == 11) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.fiveq);
                            k += 1;
                        }
                    });
                }

            }
        }, delay1, period1);
        //6
        timer5.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                time++;
                if (k == 12) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.six);
                            k += 1;
                            mPlayer4.stop();
                            mPlayer5.start();
                        }
                    });
                }
                if (k == 13) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.sixq);
                            k += 2;
                        }
                    });
                }
            }
        }, delay1, period1);
        //7
        timer6.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                time++;
                if (k == 14) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.seven);
                            k += 1;
                            mPlayer5.stop();
                            mPlayer6.start();
                        }
                    });
                }
            }
        }, delay, period);
        //8
        timer7.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                time++;
                if (k == 15) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.eight);
                            k += 1;
                            mPlayer6.stop();
                            mPlayer7.start();
                        }
                    });
                }
                if (k == 16) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.eightq);
                            mPlayer.stop();
                            k += 1;
                        }
                    });
                }

            }
        }, delay, period);
        //9
        timer8.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                time++;
                if (k == 17) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.nine);
                            k += 1;
                            mPlayer7.stop();
                            mPlayer8.start();
                        }
                    });
                }
                if (k == 18) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.nineq);
                            k += 2;
                        }
                    });
                }
            }
        }, delay, period);
        //10
        timer9.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                time++;
                if (k == 20) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.ten);
                            k += 1;
                            mPlayer8.stop();
                            mPlayer9.start();
                        }
                    });
                }
                if (k == 21) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.www);
                            k += 1;
                        }
                    });
                }
                if (k == 22) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.wwww);
                            k += 1;
                        }
                    });
                }
            }
        }, delay, period);
        //11
        timer10.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                time++;
                if (k == 23) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.elevene);
                            k += 1;
                            mPlayer9.stop();
                            mPlayer10.start();
                        }
                    });
                }
                if (k == 24) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.elevenq);
                            k += 1;
                        }
                    });
                }
            }
        }, delay1, period1);
        //12
        Intent musemsClass = new Intent(this, museums.class);
        timer11.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                time++;
                if (k == 25) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.twelw);
                            k += 1;
                            mPlayer10.stop();
                            mPlayer11.start();
                        }
                    });
                }
                if (k == 26) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.drawable.twelwq);
                            mPlayer11.stop();
                            k += 1;
                        }
                    });
                }
                if (k == 27) {
                    startActivity(musemsClass);
                }

            }
        }, delay3, period3);
    }



    public void onBackPressed(){
        Intent intent = new Intent(this, museums.class);
        startActivity(intent);
        finish();
        mPlayer.stop();
        mPlayer0.stop();
        mPlayer1.stop();
        mPlayer2.stop();
        mPlayer3.stop();
        mPlayer4.stop();
        mPlayer5.stop();
        mPlayer6.stop();
        mPlayer7.stop();
        mPlayer8.stop();
        mPlayer9.stop();
        mPlayer10.stop();
        mPlayer11.stop();
    }

}