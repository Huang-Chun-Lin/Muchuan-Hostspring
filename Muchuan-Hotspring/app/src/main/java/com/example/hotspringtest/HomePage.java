package com.example.hotspringtest;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

public class HomePage extends AppCompatActivity {

    private int sss = 100;
    private int b2 = 12*sss;
    private int y2 = 30*sss;
    private int r2 = 36*sss;
    private int b3 = 12*sss;
    private int y3 = 66*sss;
    private int r3 = 72*sss;
    private int time1 = 18*sss;
    private int time2 = 36*sss;
    public boolean people2_1;
    public boolean people2_2;
    public boolean people2_3;
    public boolean people2_4;
    public boolean people2_5;

    public boolean people2_7;
    public boolean people2_8;
    public boolean people2_9;
    public boolean people2_10;
    public boolean people2_11;
    public boolean people2_12;
    public boolean people2_13;
    public boolean people2_14;
    public boolean people2_15;
    public boolean people2_16;
    public boolean people2_17;
    public boolean people2_18;
    public boolean people2_19;
    public boolean people2_20;
    public boolean people2_21;
    public boolean people2_22;
    public boolean people2_23;
    public boolean people2_24;
    public boolean people2_25;
    //public boolean people2_266;
    public boolean people2_27RR;
    public boolean people2_28RR;
    public boolean people2_66;
    public boolean people2_26RR;

    private SharedPreferences sharedPreferences1;
    private SharedPreferences.Editor editor1;
    private static final String TIMER_STARTED_KEY1 = "timer_started1";
    private static final String START_TIME_KEY1 = "start_time1";
    private static final String ELAPSED_TIME_KEY1 = "elapsed_time1";

    private SharedPreferences sharedPreferences2;
    private SharedPreferences.Editor editor2;
    private static final String TIMER_STARTED_KEY2 = "timer_started2";
    private static final String START_TIME_KEY2 = "start_time2";
    private static final String ELAPSED_TIME_KEY2 = "elapsed_time2";

    private SharedPreferences sharedPreferences3;
    private SharedPreferences.Editor editor3;
    private static final String TIMER_STARTED_KEY3 = "timer_started3";
    private static final String START_TIME_KEY3 = "start_time3";
    private static final String ELAPSED_TIME_KEY3 = "elapsed_time3";

    private SharedPreferences sharedPreferences4;
    private SharedPreferences.Editor editor4;
    private static final String TIMER_STARTED_KEY4 = "timer_started4";
    private static final String START_TIME_KEY4 = "start_time4";
    private static final String ELAPSED_TIME_KEY4 = "elapsed_time4";
    private SharedPreferences sharedPreferences5;
    private SharedPreferences.Editor editor5;
    private static final String TIMER_STARTED_KEY5 = "timer_started5";
    private static final String START_TIME_KEY5 = "start_time5";
    private static final String ELAPSED_TIME_KEY5 = "elapsed_time5";



    private SharedPreferences sharedPreferences7;
    private SharedPreferences.Editor editor7;
    private static final String TIMER_STARTED_KEY7 = "timer_started7";
    private static final String START_TIME_KEY7 = "start_time7";
    private static final String ELAPSED_TIME_KEY7 = "elapsed_time7";

    private SharedPreferences sharedPreferences8;
    private SharedPreferences.Editor editor8;
    private static final String TIMER_STARTED_KEY8 = "timer_started8";
    private static final String START_TIME_KEY8 = "start_time8";
    private static final String ELAPSED_TIME_KEY8 = "elapsed_time8";

    private SharedPreferences sharedPreferences9;
    private SharedPreferences.Editor editor9;
    private static final String TIMER_STARTED_KEY9 = "timer_started9";
    private static final String START_TIME_KEY9 = "start_time9";
    private static final String ELAPSED_TIME_KEY9 = "elapsed_time9";

    private SharedPreferences sharedPreferences10;
    private SharedPreferences.Editor editor10;
    private static final String TIMER_STARTED_KEY10 = "timer_started10";
    private static final String START_TIME_KEY10 = "start_time10";
    private static final String ELAPSED_TIME_KEY10 = "elapsed_time10";

    private SharedPreferences sharedPreferences11;
    private SharedPreferences.Editor editor11;
    private static final String TIMER_STARTED_KEY11 = "timer_started11";
    private static final String START_TIME_KEY11 = "start_time11";
    private static final String ELAPSED_TIME_KEY11 = "elapsed_time11";

    private SharedPreferences sharedPreferences12;
    private SharedPreferences.Editor editor12;
    private static final String TIMER_STARTED_KEY12 = "timer_started12";
    private static final String START_TIME_KEY12 = "start_time12";
    private static final String ELAPSED_TIME_KEY12 = "elapsed_time12";
    private SharedPreferences sharedPreferences13;
    private SharedPreferences.Editor editor13;
    private static final String TIMER_STARTED_KEY13 = "timer_started13";
    private static final String START_TIME_KEY13 = "start_time13";
    private static final String ELAPSED_TIME_KEY13 = "elapsed_time13";

    private SharedPreferences sharedPreferences14;
    private SharedPreferences.Editor editor14;
    private static final String TIMER_STARTED_KEY14 = "timer_started14";
    private static final String START_TIME_KEY14 = "start_time14";
    private static final String ELAPSED_TIME_KEY14 = "elapsed_time14";

    private SharedPreferences sharedPreferences15;
    private SharedPreferences.Editor editor15;
    private static final String TIMER_STARTED_KEY15 = "timer_started15";
    private static final String START_TIME_KEY15 = "start_time15";
    private static final String ELAPSED_TIME_KEY15 = "elapsed_time15";

    private SharedPreferences sharedPreferences16;
    private SharedPreferences.Editor editor16;
    private static final String TIMER_STARTED_KEY16 = "timer_started16";
    private static final String START_TIME_KEY16 = "start_time16";
    private static final String ELAPSED_TIME_KEY16 = "elapsed_time16";

    private SharedPreferences sharedPreferences17;
    private SharedPreferences.Editor editor17;
    private static final String TIMER_STARTED_KEY17 = "timer_started17";
    private static final String START_TIME_KEY17 = "start_time17";
    private static final String ELAPSED_TIME_KEY17 = "elapsed_time17";

    private SharedPreferences sharedPreferences18;
    private SharedPreferences.Editor editor18;
    private static final String TIMER_STARTED_KEY18 = "timer_started18";
    private static final String START_TIME_KEY18 = "start_time18";
    private static final String ELAPSED_TIME_KEY18 = "elapsed_time18";

    private SharedPreferences sharedPreferences19;
    private SharedPreferences.Editor editor19;
    private static final String TIMER_STARTED_KEY19 = "timer_started19";
    private static final String START_TIME_KEY19 = "start_time19";
    private static final String ELAPSED_TIME_KEY19 = "elapsed_time19";

    private SharedPreferences sharedPreferences20;
    private SharedPreferences.Editor editor20;
    private static final String TIMER_STARTED_KEY20 = "timer_started20";
    private static final String START_TIME_KEY20 = "start_time20";
    private static final String ELAPSED_TIME_KEY20 = "elapsed_time20";

    private SharedPreferences sharedPreferences21;
    private SharedPreferences.Editor editor21;
    private static final String TIMER_STARTED_KEY21 = "timer_started21";
    private static final String START_TIME_KEY21 = "start_time21";
    private static final String ELAPSED_TIME_KEY21 = "elapsed_time21";

    private SharedPreferences sharedPreferences22;
    private SharedPreferences.Editor editor22;
    private static final String TIMER_STARTED_KEY22 = "timer_started22";
    private static final String START_TIME_KEY22 = "start_time22";
    private static final String ELAPSED_TIME_KEY22 = "elapsed_time22";

    private SharedPreferences sharedPreferences23;
    private SharedPreferences.Editor editor23;
    private static final String TIMER_STARTED_KEY23 = "timer_started23";
    private static final String START_TIME_KEY23 = "start_time23";
    private static final String ELAPSED_TIME_KEY23 = "elapsed_time23";

    private SharedPreferences sharedPreferences24;
    private SharedPreferences.Editor editor24;
    private static final String TIMER_STARTED_KEY24 = "timer_started24";
    private static final String START_TIME_KEY24 = "start_time24";
    private static final String ELAPSED_TIME_KEY24 = "elapsed_time24";

    private SharedPreferences sharedPreferences25;
    private SharedPreferences.Editor editor25;
    private static final String TIMER_STARTED_KEY25 = "timer_started25";
    private static final String START_TIME_KEY25 = "start_time25";
    private static final String ELAPSED_TIME_KEY25 = "elapsed_time25";

    private SharedPreferences sharedPreferences266;
    private SharedPreferences.Editor editor266;
    private static final String TIMER_STARTED_KEY266 = "timer_started266";
    private static final String START_TIME_KEY266 = "start_time266";
    private static final String ELAPSED_TIME_KEY266 = "elapsed_time266";

    private SharedPreferences sharedPreferences27RR;
    private SharedPreferences.Editor editor27RR;
    private static final String TIMER_STARTED_KEY27RR = "timer_started27RR";
    private static final String START_TIME_KEY27RR = "start_time27RR";
    private static final String ELAPSED_TIME_KEY27RR = "elapsed_time27RR";

    private SharedPreferences sharedPreferences28RR;
    private SharedPreferences.Editor editor28RR;
    private static final String TIMER_STARTED_KEY28RR = "timer_started28RR";
    private static final String START_TIME_KEY28RR = "start_time28RR";
    private static final String ELAPSED_TIME_KEY28RR = "elapsed_time28RR";

    private SharedPreferences sharedPreferences66;
    private SharedPreferences.Editor editor66;
    private static final String TIMER_STARTED_KEY66 = "timer_started66";
    private static final String START_TIME_KEY66 = "start_time66";
    private static final String ELAPSED_TIME_KEY66 = "elapsed_time66";

    private SharedPreferences sharedPreferences26RR;
    private SharedPreferences.Editor editor26RR;
    private static final String TIMER_STARTED_KEY26RR = "timer_started26RR";
    private static final String START_TIME_KEY26RR = "start_time26RR";
    private static final String ELAPSED_TIME_KEY26RR = "elapsed_time26RR";


    private Handler handler1 = new Handler();
    private int originalblueThreshold2 = b2;
    private int originalyellowThreshold2 = y2;
    private int originalredThreshold2 = r2;
    private int originalblueThreshold3 = b3;
    private int originalyellowThreshold3 = y3;
    private int originalredThreshold3 = r3;


    private long startTime1 = 0L;
    private long timeInMilliseconds1 = 0L;
    private long updatedTime1 = 0L;
    private int seconds1 = 0;
    private int sec1 = 0;
    private int minutes1 = 0;
    private int hours1 = 0;
    private Button btnTimer1;
    //此為測試用 正式版應改為正確時間
    private int blueThreshold1 = b2;   //b2
    private int yellowThreshold1 = y2; //y2
    private int redThreshold1 = r2;    //r2
    //此為測試用 正式版應改為正確時間
    public int people1;
    private boolean isTimerRunning1 = false;



    private long startTime2 = 0L;
    private long timeInMilliseconds2 = 0L;
    private long updatedTime2 = 0L;
    private int seconds2 = 0;
    private int sec2 = 0;
    private int minutes2 = 0;
    private int hours2 = 0;
    private Button btnTimer2;
    private int blueThreshold2 = b2;
    private int yellowThreshold2 = y2;
    private int redThreshold2 = r2;
    public int people2;
    private boolean isTimerRunning2 = false;


    private long startTime3 = 0L;
    private long timeInMilliseconds3 = 0L;
    private long updatedTime3 = 0L;
    private int seconds3 = 0;
    private int sec3 = 0;
    private int minutes3 = 0;
    private int hours3 = 0;
    private Button btnTimer3;
    private int blueThreshold3 = b2;
    private int yellowThreshold3 = y2;
    private int redThreshold3 = r2;
    public int people3;
    private boolean isTimerRunning3 = false;


    private long startTime4 = 0L;
    private long timeInMilliseconds4 = 0L;
    private long updatedTime4 = 0L;
    private int seconds4 = 0;
    private int sec4 = 0;
    private int minutes4 = 0;
    private int hours4 = 0;
    private Button btnTimer4;
    private int blueThreshold4 = b2;
    private int yellowThreshold4 = y2;
    private int redThreshold4 = r2;
    public int people4;
    private boolean isTimerRunning4 = false;

    private long startTime5 = 0L;
    private long timeInMilliseconds5 = 0L;
    private long updatedTime5 = 0L;
    private int seconds5 = 0;
    private int sec5 = 0;
    private int minutes5 = 0;
    private int hours5 = 0;
    private Button btnTimer5;
    private int blueThreshold5 = b2;
    private int yellowThreshold5 = y2;
    private int redThreshold5 = r2;
    public int people5;
    private boolean isTimerRunning5 = false;

    private long startTime6 = 0L;
    private long timeInMilliseconds6 = 0L;
    private long updatedTime6 = 0L;
    private int seconds6 = 0;
    private int sec6 = 0;
    private int minutes6 = 0;
    private int hours6 = 0;
    private Button btnTimer6;
    private int blueThreshold6 = b2;
    private int yellowThreshold6 = y2;
    private int redThreshold6 = r2;
    public int people6;
    private boolean isTimerRunning6 = false;

    private long startTime7 = 0L;
    private long timeInMilliseconds7 = 0L;
    private long updatedTime7 = 0L;
    private int seconds7 = 0;
    private int sec7 = 0;
    private int minutes7 = 0;
    private int hours7 = 0;
    private Button btnTimer7;
    private int blueThreshold7 = b2;
    private int yellowThreshold7 = y2;
    private int redThreshold7 = r2;
    public int people7;
    private boolean isTimerRunning7 = false;

    private long startTime8 = 0L;
    private long timeInMilliseconds8 = 0L;
    private long updatedTime8 = 0L;
    private int seconds8 = 0;
    private int sec8 = 0;
    private int minutes8 = 0;
    private int hours8 = 0;
    private Button btnTimer8;
    private int blueThreshold8 = b2;
    private int yellowThreshold8 = y2;
    private int redThreshold8 = r2;
    public int people8;
    private boolean isTimerRunning8 = false;

    private long startTime9 = 0L;
    private long timeInMilliseconds9 = 0L;
    private long updatedTime9 = 0L;
    private int seconds9 = 0;
    private int sec9 = 0;
    private int minutes9 = 0;
    private int hours9 = 0;
    private Button btnTimer9;
    private int blueThreshold9 = b2;
    private int yellowThreshold9 = y2;
    private int redThreshold9 = r2;
    public int people9;
    private boolean isTimerRunning9 = false;

    private long startTime10 = 0L;
    private long timeInMilliseconds10 = 0L;
    private long updatedTime10 = 0L;
    private int seconds10 = 0;
    private int sec10 = 0;
    private int minutes10 = 0;
    private int hours10 = 0;
    private Button btnTimer10;
    private int blueThreshold10 = b2;
    private int yellowThreshold10 = y2;
    private int redThreshold10 = r2;
    public int people10;
    private boolean isTimerRunning10 = false;

    private long startTime11 = 0L;
    private long timeInMilliseconds11 = 0L;
    private long updatedTime11 = 0L;
    private int seconds11 = 0;
    private int sec11 = 0;
    private int minutes11 = 0;
    private int hours11 = 0;
    private Button btnTimer11;
    private int blueThreshold11 = b2;
    private int yellowThreshold11 = y2;
    private int redThreshold11 = r2;
    public int people11;
    private boolean isTimerRunning11 = false;

    private long startTime16 = 0L;
    private long timeInMilliseconds16 = 0L;
    private long updatedTime16 = 0L;
    private int seconds16 = 0;
    private int sec16 = 0;
    private int minutes16 = 0;
    private int hours16 = 0;
    private Button btnTimer16;
    private int blueThreshold16 = b2;
    private int yellowThreshold16 = y2;
    private int redThreshold16 = r2;
    public int people16;
    private boolean isTimerRunning16 = false;

    private long startTime17 = 0L;
    private long timeInMilliseconds17 = 0L;
    private long updatedTime17 = 0L;
    private int seconds17 = 0;
    private int sec17 = 0;
    private int minutes17 = 0;
    private int hours17 = 0;
    private Button btnTimer17;
    private int blueThreshold17 = b2;
    private int yellowThreshold17 = y2;
    private int redThreshold17 = r2;
    public int people17;
    private boolean isTimerRunning17 = false;


    private long startTime18 = 0L;
    private long timeInMilliseconds18 = 0L;
    private long updatedTime18 = 0L;
    private int seconds18 = 0;
    private int sec18 = 0;
    private int minutes18 = 0;
    private int hours18 = 0;
    private Button btnTimer18;
    private int blueThreshold18 = b2;
    private int yellowThreshold18 = y2;
    private int redThreshold18 = r2;
    public int people18;
    private boolean isTimerRunning18 = false;

    private long startTime19 = 0L;
    private long timeInMilliseconds19 = 0L;
    private long updatedTime19 = 0L;
    private int seconds19 = 0;
    private int sec19 = 0;
    private int minutes19 = 0;
    private int hours19 = 0;
    private Button btnTimer19;
    private int blueThreshold19 = b2;
    private int yellowThreshold19 = y2;
    private int redThreshold19 = r2;
    public int people19;
    private boolean isTimerRunning19 = false;

    private long startTime20 = 0L;
    private long timeInMilliseconds20 = 0L;
    private long updatedTime20 = 0L;
    private int seconds20 = 0;
    private int sec20 = 0;
    private int minutes20 = 0;
    private int hours20 = 0;
    private Button btnTimer20;
    private int blueThreshold20 = b2;
    private int yellowThreshold20 = y2;
    private int redThreshold20 = r2;
    public int people20;
    private boolean isTimerRunning20 = false;


    private long startTime21 = 0L;
    private long timeInMilliseconds21 = 0L;
    private long updatedTime21 = 0L;
    private int seconds21 = 0;
    private int sec21 = 0;
    private int minutes21 = 0;
    private int hours21 = 0;
    private Button btnTimer21;
    private int blueThreshold21 = b2;
    private int yellowThreshold21 = y2;
    private int redThreshold21 = r2;
    public int people21;
    private boolean isTimerRunning21 = false;

    private long startTime22 = 0L;
    private long timeInMilliseconds22 = 0L;
    private long updatedTime22 = 0L;
    private int seconds22 = 0;
    private int sec22 = 0;
    private int minutes22 = 0;
    private int hours22 = 0;
    private Button btnTimer22;
    private int blueThreshold22 = b2;
    private int yellowThreshold22 = y2;
    private int redThreshold22 = r2;
    public int people22;
    private boolean isTimerRunning22 = false;

    private long startTime23 = 0L;
    private long timeInMilliseconds23 = 0L;
    private long updatedTime23 = 0L;
    private int seconds23 = 0;
    private int sec23 = 0;
    private int minutes23 = 0;
    private int hours23 = 0;
    private Button btnTimer23;
    private int blueThreshold23 = b2;
    private int yellowThreshold23 = y2;
    private int redThreshold23 = r2;
    public int people23;
    private boolean isTimerRunning23 = false;

    private long startTime24 = 0L;
    private long timeInMilliseconds24 = 0L;
    private long updatedTime24 = 0L;
    private int seconds24 = 0;
    private int sec24 = 0;
    private int minutes24 = 0;
    private int hours24 = 0;
    private Button btnTimer24;
    private int blueThreshold24 = b2;
    private int yellowThreshold24 = y2;
    private int redThreshold24 = r2;
    public int people24;
    private boolean isTimerRunning24 = false;


    private long startTime25 = 0L;
    private long timeInMilliseconds25 = 0L;
    private long updatedTime25 = 0L;
    private int seconds25 = 0;
    private int sec25 = 0;
    private int minutes25 = 0;
    private int hours25 = 0;
    private Button btnTimer25;
    private int blueThreshold25 = b2;
    private int yellowThreshold25 = y2;
    private int redThreshold25 = r2;
    public int people25;
    private boolean isTimerRunning25 = false;

    private long startTime266 = 0L;
    private long timeInMilliseconds266 = 0L;
    private long updatedTime266 = 0L;
    private int seconds266 = 0;
    private int sec266 = 0;
    private int minutes266 = 0;
    private int hours266 = 0;
    private Button btnTimer266;
    private int blueThreshold266 = b2;
    private int yellowThreshold266 = y2;
    private int redThreshold266 = r2;
    public int people266;
    private boolean isTimerRunning266 = false;

    private long startTime27RR = 0L;
    private long timeInMilliseconds27RR = 0L;
    private long updatedTime27RR = 0L;
    private int seconds27RR = 0;
    private int sec27RR = 0;
    private int minutes27RR = 0;
    private int hours27RR = 0;
    private Button btnTimer27RR;
    private int blueThreshold27RR = b2;
    private int yellowThreshold27RR = y2;
    private int redThreshold27RR = r2;
    public int people27RR;
    private boolean isTimerRunning27RR = false;

    private long startTime28RR = 0L;
    private long timeInMilliseconds28RR = 0L;
    private long updatedTime28RR= 0L;
    private int seconds28RR = 0;
    private int sec28RR = 0;
    private int minutes28RR = 0;
    private int hours28RR = 0;
    private Button btnTimer28RR;
    private int blueThreshold28RR = b2;
    private int yellowThreshold28RR = y2;
    private int redThreshold28RR = r2;
    public int people28RR;
    private boolean isTimerRunning28RR = false;

    private long startTime66 = 0L;
    private long timeInMilliseconds66 = 0L;
    private long updatedTime66 = 0L;
    private int seconds66 = 0;
    private int sec66 = 0;
    private int minutes66 = 0;
    private int hours66 = 0;
    private Button btnTimer66;
    private int blueThreshold66 = b2;
    private int yellowThreshold66 = y2;
    private int redThreshold66 = r2;
    public int people66;
    private boolean isTimerRunning66 = false;

    private long startTime201 = 0L;
    private long timeInMilliseconds201 = 0L;
    private long updatedTime201 = 0L;
    private int seconds201 = 0;
    private int sec201 = 0;
    private int minutes201 = 0;
    private int hours201 = 0;
    private Button btnTimer201;
    private int blueThreshold201 = b3;
    private int yellowThreshold201 = y3;
    private int redThreshold201 = r3;
    public int people201;
    private boolean isTimerRunning201 = false;

    private long startTime202 = 0L;
    private long timeInMilliseconds202 = 0L;
    private long updatedTime202 = 0L;
    private int seconds202 = 0;
    private int sec202 = 0;
    private int hours202 = 0;
    private int minutes202 = 0;
    private Button btnTimer202;
    private int blueThreshold202 = b3;
    private int yellowThreshold202 = y3;
    private int redThreshold202 = r3;
    public int people202;
    private boolean isTimerRunning202 = false;

    private long startTime203 = 0L;
    private long timeInMilliseconds203 = 0L;
    private long updatedTime203 = 0L;
    private int seconds203 = 0;
    private int sec203 = 0;
    private int minutes203 = 0;
    private int hours203 = 0;
    private Button btnTimer203;
    private int blueThreshold203 = b3;
    private int yellowThreshold203 = y3;
    private int redThreshold203 = r3;
    public int people203;
    private boolean isTimerRunning203 = false;

    private long startTime204 = 0L;
    private long timeInMilliseconds204 = 0L;
    private long updatedTime204 = 0L;
    private int seconds204 = 0;
    private int sec204 = 0;
    private int minutes204 = 0;
    private int hours204 = 0;
    private Button btnTimer204;
    private int blueThreshold204 = b3;
    private int yellowThreshold204 = y3;
    private int redThreshold204 = r3;
    public int people204;
    private boolean isTimerRunning204 = false;

    private long startTime26RR = 0L;
    private long timeInMilliseconds26RR = 0L;
    private long updatedTime26RR = 0L;
    private int seconds26RR = 0;
    private int sec26RR = 0;
    private int minutes26RR = 0;
    private int hours26RR = 0;
    private Button btnTimer26RR;
    private int blueThreshold26RR = b2;
    private int yellowThreshold26RR = y2;
    private int redThreshold26RR = r2;
    public int people26RR;
    private boolean isTimerRunning26RR = false;

    private boolean flashing1;
    private boolean flashing2;
    private boolean flashing3;
    private boolean flashing4;
    private boolean flashing5;
    private boolean flashing6;
    private boolean flashing7;
    private boolean flashing8 ;
    private boolean flashing9 ;
    private boolean flashing10 ;
    private boolean flashing11 ;
    private boolean flashing201 ;
    private boolean flashing202 ;
    private boolean flashing203 ;
    private boolean flashing204 ;
    private boolean flashing16 ;
    private boolean flashing17 ;
    private boolean flashing18 ;
    private boolean flashing19 ;
    private boolean flashing20 ;
    private boolean flashing21 ;
    private boolean flashing22 ;
    private boolean flashing23 ;
    private boolean flashing24 ;
    private boolean flashing25 ;
    //private boolean flashing266 ;
    private boolean flashing27RR ;
    private boolean flashing28RR ;

    private boolean flashing66 ;
    private boolean flashing26RR ;

    private boolean flashingg1;
    private boolean flashingg2 ;
    private boolean flashingg3 ;
    private boolean flashingg4 ;
    private boolean flashingg5 ;
   // private boolean flashingg6 ;
    private boolean flashingg7 ;
    private boolean flashingg8 ;
    private boolean flashingg9 ;
    private boolean flashingg10 ;
    private boolean flashingg11 ;
    private boolean flashingg201 ;
    private boolean flashingg202 ;
    private boolean flashingg203 ;
    private boolean flashingg204 ;
    private boolean flashingg16 ;
    private boolean flashingg17 ;
    private boolean flashingg18 ;
    private boolean flashingg19 ;
    private boolean flashingg20 ;
    private boolean flashingg21 ;
    private boolean flashingg22 ;
    private boolean flashingg23 ;
    private boolean flashingg24 ;
    private boolean flashingg25 ;
    //private boolean flashingg266 ;
    private boolean flashingg27RR ;
    private boolean flashingg28RR ;
    private boolean flashingg66 ;

    private boolean flashingg26RR ;

    // 獲得現在的時間

    int currentHour1;
    int currentMinute1;

    int currentHour2;
    int currentMinute2;

    int currentHour3;
    int currentMinute3;

    int currentHour4;
    int currentMinute4;

    int currentHour5;
    int currentMinute5;

    int currentHour6;
    int currentMinute6;

    int currentHour7;
    int currentMinute7;

    int currentHour8;
    int currentMinute8;

    int currentHour9;
    int currentMinute9;

    int currentHour10;
    int currentMinute10;

    int currentHour11;
    int currentMinute11;

    int currentHour12;
    int currentMinute12;

    int currentHour13;
    int currentMinute13;

    int currentHour14;
    int currentMinute14;

    int currentHour15;
    int currentMinute15;

    int currentHour16;
    int currentMinute16;

    int currentHour17;
    int currentMinute17;

    int currentHour18;
    int currentMinute18;

    int currentHour19;
    int currentMinute19;

    int currentHour20;
    int currentMinute20;

    int currentHour21;
    int currentMinute21;

    int currentHour22;
    int currentMinute22;

    int currentHour23;
    int currentMinute23;

    int currentHour24;
    int currentMinute24;

    int currentHour25;
    int currentMinute25;

    //int currentHour266;
    //int currentMinute266;

    int currentHour27RR;
    int currentMinute27RR;

    int currentHour28RR;
    int currentMinute28RR;

    int currentHour66;
    int currentMinute66;
    int currentHour26RR;
    int currentMinute26RR;

    int futureHour1;
    int futureMinute1;
    int futureHour2;
    int futureMinute2;

    int futureHour3;
    int futureMinute3;

    int futureHour4;
    int futureMinute4;

    int futureHour5;
    int futureMinute5;

    int futureHour6;
    int futureMinute6;

    int futureHour7;
    int futureMinute7;

    int futureHour8;
    int futureMinute8;

    int futureHour9;
    int futureMinute9;

    int futureHour10;
    int futureMinute10;

    int futureHour11;
    int futureMinute11;

    int futureHour12;
    int futureMinute12;

    int futureHour13;
    int futureMinute13;

    int futureHour14;
    int futureMinute14;

    int futureHour15;
    int futureMinute15;

    int futureHour16;
    int futureMinute16;

    int futureHour17;
    int futureMinute17;

    int futureHour18;
    int futureMinute18;

    int futureHour19;
    int futureMinute19;

    int futureHour20;
    int futureMinute20;

    int futureHour21;
    int futureMinute21;

    int futureHour22;
    int futureMinute22;

    int futureHour23;
    int futureMinute23;

    int futureHour24;
    int futureMinute24;

    int futureHour25;
    int futureMinute25;

   // int futureHour266;
    //int futureMinute266;

    int futureHour27RR;
    int futureMinute27RR;

    int futureHour28RR;
    int futureMinute28RR;
    int futureHour66;
    int futureMinute66;
    int futureHour26RR;
    int futureMinute26RR;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);



        // 啟動計時器服務
        Intent timerServiceIntent = new Intent(this, TimerServiceS1.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntent);
        } else {
            startService(timerServiceIntent);
        }
        // 初始化 SharedPreferences 和 editor1
        sharedPreferences1 = PreferenceManager.getDefaultSharedPreferences(this);
        editor1 = sharedPreferences1.edit();

        // 初始化 SharedPreferences 和 editor2
        sharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(this);
        editor2 = sharedPreferences2.edit();
// 初始化 SharedPreferences 和 editor3
        sharedPreferences3 = PreferenceManager.getDefaultSharedPreferences(this);
        editor3 = sharedPreferences3.edit();

// 初始化 SharedPreferences 和 editor4
        sharedPreferences4 = PreferenceManager.getDefaultSharedPreferences(this);
        editor4 = sharedPreferences4.edit();
        sharedPreferences5 = PreferenceManager.getDefaultSharedPreferences(this);
        editor5 = sharedPreferences5.edit();



        sharedPreferences7 = PreferenceManager.getDefaultSharedPreferences(this);
        editor7 = sharedPreferences7.edit();

        sharedPreferences8 = PreferenceManager.getDefaultSharedPreferences(this);
        editor8 = sharedPreferences8.edit();

        sharedPreferences9 = PreferenceManager.getDefaultSharedPreferences(this);
        editor9 = sharedPreferences9.edit();

        sharedPreferences10 = PreferenceManager.getDefaultSharedPreferences(this);
        editor10 = sharedPreferences10.edit();

        sharedPreferences11 = PreferenceManager.getDefaultSharedPreferences(this);
        editor11 = sharedPreferences11.edit();

        sharedPreferences12 = PreferenceManager.getDefaultSharedPreferences(this);
        editor12 = sharedPreferences12.edit();

        sharedPreferences13 = PreferenceManager.getDefaultSharedPreferences(this);
        editor13 = sharedPreferences13.edit();

        sharedPreferences14 = PreferenceManager.getDefaultSharedPreferences(this);
        editor14 = sharedPreferences14.edit();

        sharedPreferences15 = PreferenceManager.getDefaultSharedPreferences(this);
        editor15 = sharedPreferences15.edit();

        sharedPreferences16 = PreferenceManager.getDefaultSharedPreferences(this);
        editor16 = sharedPreferences16.edit();

        sharedPreferences17 = PreferenceManager.getDefaultSharedPreferences(this);
        editor17 = sharedPreferences17.edit();

        sharedPreferences18 = PreferenceManager.getDefaultSharedPreferences(this);
        editor18 = sharedPreferences18.edit();

        sharedPreferences19 = PreferenceManager.getDefaultSharedPreferences(this);
        editor19 = sharedPreferences19.edit();

        sharedPreferences20 = PreferenceManager.getDefaultSharedPreferences(this);
        editor20 = sharedPreferences20.edit();

        sharedPreferences21 = PreferenceManager.getDefaultSharedPreferences(this);
        editor21 = sharedPreferences21.edit();

        sharedPreferences22 = PreferenceManager.getDefaultSharedPreferences(this);
        editor22 = sharedPreferences22.edit();

        sharedPreferences23 = PreferenceManager.getDefaultSharedPreferences(this);
        editor23 = sharedPreferences23.edit();

        sharedPreferences24 = PreferenceManager.getDefaultSharedPreferences(this);
        editor24 = sharedPreferences24.edit();

        sharedPreferences25 = PreferenceManager.getDefaultSharedPreferences(this);
        editor25 = sharedPreferences25.edit();

        //sharedPreferences266 = PreferenceManager.getDefaultSharedPreferences(this);
        //editor266 = sharedPreferences266.edit();

        sharedPreferences27RR = PreferenceManager.getDefaultSharedPreferences(this);
        editor27RR = sharedPreferences27RR.edit();

        sharedPreferences28RR = PreferenceManager.getDefaultSharedPreferences(this);
        editor28RR = sharedPreferences28RR.edit();

        sharedPreferences66 = PreferenceManager.getDefaultSharedPreferences(this);
        editor66 = sharedPreferences66.edit();

        sharedPreferences26RR = PreferenceManager.getDefaultSharedPreferences(this);
        editor26RR = sharedPreferences26RR.edit();


        btnTimer1 = findViewById(R.id.button1);
        btnTimer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning1){
                    showConfirmationDialogForButton1();
                    updateButtonColor1(); // 更新颜色
                } else if (isTimerRunning1) {
                    if (sec1 < blueThreshold1) {
                        updateButtonColor1();
                        showConfirmationDialogYNForButton1();
                    } else if (blueThreshold1 <= sec1  && sec1 < yellowThreshold1  ) {
                        if(!flashing1){
                            flashing1 = true; // 停止蓝色闪烁
                            updateButtonColor1();
                        } else if (flashing1) {
                            updateButtonColor1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (yellowThreshold1 <= sec1  && sec1 < redThreshold1) {
                        if(!flashingg1){
                            flashingg1 = true; // 停止黄色闪烁
                            updateButtonColor1();
                        } else if (flashingg1) {
                            updateButtonColor1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (sec1 >= redThreshold1) {
                        updateButtonColor1();
                        showConfirmationDialogYNForButton1();
                    }
                }
            }
        });

        btnTimer1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton1();
                return true;
            }
        });

        btnTimer2 = findViewById(R.id.button2);
        btnTimer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning2){
                    showConfirmationDialogForButton2();
                    updateButtonColor2(); // 更新颜色
                } else if (isTimerRunning2) {
                    if (sec2 < blueThreshold2) {
                        updateButtonColor2();
                        showConfirmationDialogYNForButton2();
                    } else if (blueThreshold2 <= sec2  && sec2 < yellowThreshold2  ) {
                        if(!flashing2){
                            flashing2 = true; // 停止蓝色闪烁
                            updateButtonColor2();
                        } else if (flashing2) {
                            updateButtonColor2();
                            showConfirmationDialogYNForButton2();
                        }

                    } else if (yellowThreshold2 <= sec2  && sec2 < redThreshold2) {
                        if(!flashingg2){
                            flashingg2 = true; // 停止黄色闪烁
                            updateButtonColor2();
                        } else if (flashingg2) {
                            updateButtonColor2();
                            showConfirmationDialogYNForButton2();
                        }

                    } else if (sec2 >= redThreshold2) {
                        updateButtonColor2();
                        showConfirmationDialogYNForButton2();
                    }
                }
            }
        });

        btnTimer2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton2();
                return true;
            }
        });


        btnTimer3 = findViewById(R.id.button3);
        btnTimer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning3){
                    showConfirmationDialogForButton3();
                    updateButtonColor3(); // 更新颜色
                } else if (isTimerRunning3) {
                    if (sec3 < blueThreshold3) {
                        updateButtonColor3();
                        showConfirmationDialogYNForButton3();
                    } else if (blueThreshold3 <= sec3  && sec3 < yellowThreshold3  ) {
                        if(!flashing3){
                            flashing3 = true; // 停止蓝色闪烁
                            updateButtonColor3();
                        } else if (flashing3) {
                            updateButtonColor3();
                            showConfirmationDialogYNForButton3();
                        }

                    } else if (yellowThreshold3 <= sec3  && sec3 < redThreshold3) {
                        if(!flashingg3){
                            flashingg3 = true; // 停止黄色闪烁
                            updateButtonColor3();
                        } else if (flashingg3) {
                            updateButtonColor3();
                            showConfirmationDialogYNForButton3();
                        }

                    } else if (sec3 >= redThreshold3) {
                        updateButtonColor3();
                        showConfirmationDialogYNForButton3();
                    }
                }
            }
        });

        btnTimer3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton3();
                return true;
            }
        });

        btnTimer4 = findViewById(R.id.button4);
        btnTimer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning4){
                    showConfirmationDialogForButton4();
                    updateButtonColor4(); // 更新颜色
                } else if (isTimerRunning4) {
                    if (sec4 < blueThreshold4) {
                        updateButtonColor4();
                        showConfirmationDialogYNForButton4();
                    } else if (blueThreshold4 <= sec4  && sec4 < yellowThreshold4  ) {
                        if(!flashing4){
                            flashing4 = true; // 停止蓝色闪烁
                            updateButtonColor4();
                        } else if (flashing4) {
                            updateButtonColor4();
                            showConfirmationDialogYNForButton4();
                        }

                    } else if (yellowThreshold4 <= sec4  && sec4 < redThreshold4) {
                        if(!flashingg4){
                            flashingg4 = true; // 停止黄色闪烁
                            updateButtonColor4();
                        } else if (flashingg4) {
                            updateButtonColor4();
                            showConfirmationDialogYNForButton4();
                        }

                    } else if (sec4 >= redThreshold4) {
                        updateButtonColor4();
                        showConfirmationDialogYNForButton4();
                    }
                }
            }
        });

        btnTimer4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton4();
                return true;
            }
        });

        btnTimer5 = findViewById(R.id.button5);
        btnTimer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning5){
                    showConfirmationDialogForButton5();
                    //isTimerRunning5 = true;
                    updateButtonColor5(); // 更新颜色
                } else if (isTimerRunning5) {
                    if (sec5 < blueThreshold5) {
                        updateButtonColor5();
                        showConfirmationDialogYNForButton5();
                    } else if (blueThreshold5 <= sec5  && sec5 < yellowThreshold5  ) {
                        if(!flashing5){
                            flashing5 = true; // 停止蓝色闪烁
                            updateButtonColor5();
                        } else if (flashing5) {
                            updateButtonColor5();
                            showConfirmationDialogYNForButton5();
                        }

                    } else if (yellowThreshold5 <= sec5  && sec5 < redThreshold5) {
                        if(!flashingg5){
                            flashingg5 = true; // 停止黄色闪烁
                            updateButtonColor5();
                        } else if (flashingg5) {
                            updateButtonColor5();
                            showConfirmationDialogYNForButton5();
                        }

                    } else if (sec5 >= redThreshold5) {
                        updateButtonColor5();
                        showConfirmationDialogYNForButton5();
                    }
                }
            }
        });

        btnTimer5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton5();
                return true;
            }
        });





        btnTimer7 = findViewById(R.id.button7);
        btnTimer7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning7){
                    showConfirmationDialogForButton7();
                    //isTimerRunning7 = true;
                    updateButtonColor7(); // 更新颜色
                } else if (isTimerRunning7) {
                    if (sec7 < blueThreshold7) {
                        updateButtonColor7();
                        showConfirmationDialogYNForButton7();
                    } else if (blueThreshold7 <= sec7  && sec7 < yellowThreshold7  ) {
                        if(!flashing7){
                            flashing7 = true; // 停止蓝色闪烁
                            updateButtonColor7();
                        } else if (flashing7) {
                            updateButtonColor7();
                            showConfirmationDialogYNForButton7();
                        }

                    } else if (yellowThreshold7 <= sec7  && sec7 < redThreshold7) {
                        if(!flashingg7){
                            flashingg7 = true; // 停止黄色闪烁
                            updateButtonColor7();
                        } else if (flashingg7) {
                            updateButtonColor7();
                            showConfirmationDialogYNForButton7();
                        }

                    } else if (sec7 >= redThreshold7) {
                        updateButtonColor7();
                        showConfirmationDialogYNForButton7();
                    }
                }
            }
        });

        btnTimer7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton7();
                return true;
            }
        });

        btnTimer8 = findViewById(R.id.button8);
        btnTimer8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning8){
                    showConfirmationDialogForButton8();
                    //isTimerRunning8 = true;
                    updateButtonColor8(); // 更新颜色
                } else if (isTimerRunning8) {
                    if (sec8 < blueThreshold8) {
                        updateButtonColor8();
                        showConfirmationDialogYNForButton8();
                    } else if (blueThreshold8 <= sec8  && sec8 < yellowThreshold8  ) {
                        if(!flashing8){
                            flashing8 = true; // 停止蓝色闪烁
                            updateButtonColor8();
                        } else if (flashing8) {
                            updateButtonColor8();
                            showConfirmationDialogYNForButton8();
                        }

                    } else if (yellowThreshold8 <= sec8  && sec8 < redThreshold8) {
                        if(!flashingg8){
                            flashingg8 = true; // 停止黄色闪烁
                            updateButtonColor8();
                        } else if (flashingg8) {
                            updateButtonColor8();
                            showConfirmationDialogYNForButton8();
                        }

                    } else if (sec8 >= redThreshold8) {
                        updateButtonColor8();
                        showConfirmationDialogYNForButton8();
                    }
                }
            }
        });

        btnTimer8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton8();
                return true;
            }
        });

        btnTimer9 = findViewById(R.id.button9);
        btnTimer9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning9){
                    showConfirmationDialogForButton9();
                    //isTimerRunning9 = true;
                    updateButtonColor9(); // 更新颜色
                } else if (isTimerRunning9) {
                    if (sec9 < blueThreshold9) {
                        updateButtonColor9();
                        showConfirmationDialogYNForButton9();
                    } else if (blueThreshold9 <= sec9  && sec9 < yellowThreshold9  ) {
                        if(!flashing9){
                            flashing9 = true; // 停止蓝色闪烁
                            updateButtonColor9();
                        } else if (flashing9) {
                            updateButtonColor9();
                            showConfirmationDialogYNForButton9();
                        }

                    } else if (yellowThreshold9 <= sec9  && sec9 < redThreshold9) {
                        if(!flashingg9){
                            flashingg9 = true; // 停止黄色闪烁
                            updateButtonColor9();
                        } else if (flashingg9) {
                            updateButtonColor9();
                            showConfirmationDialogYNForButton9();
                        }

                    } else if (sec9 >= redThreshold9) {
                        updateButtonColor9();
                        showConfirmationDialogYNForButton9();
                    }
                }
            }
        });

        btnTimer9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton9();
                return true;
            }
        });

        btnTimer10 = findViewById(R.id.button10);
        btnTimer10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning10){
                    showConfirmationDialogForButton10();
                    //isTimerRunning10 = true;
                    updateButtonColor10(); // 更新颜色
                } else if (isTimerRunning10) {
                    if (sec10 < blueThreshold10) {
                        updateButtonColor10();
                        showConfirmationDialogYNForButton10();
                    } else if (blueThreshold10 <= sec10  && sec10 < yellowThreshold10  ) {
                        if(!flashing10){
                            flashing10 = true; // 停止蓝色闪烁
                            updateButtonColor10();
                        } else if (flashing10) {
                            updateButtonColor10();
                            showConfirmationDialogYNForButton10();
                        }

                    } else if (yellowThreshold10 <= sec10  && sec10 < redThreshold10) {
                        if(!flashingg10){
                            flashingg10 = true; // 停止黄色闪烁
                            updateButtonColor10();
                        } else if (flashingg10) {
                            updateButtonColor10();
                            showConfirmationDialogYNForButton10();
                        }

                    } else if (sec10 >= redThreshold10) {
                        updateButtonColor10();
                        showConfirmationDialogYNForButton10();
                    }
                }
            }
        });

        btnTimer10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton10();
                return true;
            }
        });

        btnTimer11 = findViewById(R.id.button11);
        btnTimer11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning11){
                    showConfirmationDialogForButton11();
                    //isTimerRunning11 = true;
                    updateButtonColor11(); // 更新颜色
                } else if (isTimerRunning11) {
                    if (sec11 < blueThreshold11) {
                        updateButtonColor11();
                        showConfirmationDialogYNForButton11();
                    } else if (blueThreshold11 <= sec11  && sec11 < yellowThreshold11  ) {
                        if(!flashing11){
                            flashing11 = true; // 停止蓝色闪烁
                            updateButtonColor11();
                        } else if (flashing11) {
                            updateButtonColor11();
                            showConfirmationDialogYNForButton11();
                        }

                    } else if (yellowThreshold11 <= sec11  && sec11 < redThreshold11) {
                        if(!flashingg11){
                            flashingg11 = true; // 停止黄色闪烁
                            updateButtonColor11();
                        } else if (flashingg11) {
                            updateButtonColor11();
                            showConfirmationDialogYNForButton11();
                        }

                    } else if (sec11 >= redThreshold11) {
                        updateButtonColor11();
                        showConfirmationDialogYNForButton11();
                    }
                }
            }
        });

        btnTimer11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton11();
                return true;
            }
        });


        btnTimer16 = findViewById(R.id.button16);
        btnTimer16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning16){
                    showConfirmationDialogForButton16();
                    //isTimerRunning16 = true;
                    updateButtonColor16(); // 更新颜色
                } else if (isTimerRunning16) {
                    if (sec16 < blueThreshold16) {
                        updateButtonColor16();
                        showConfirmationDialogYNForButton16();
                    } else if (blueThreshold16 <= sec16  && sec16 < yellowThreshold16  ) {
                        if(!flashing16){
                            flashing16 = true; // 停止蓝色闪烁
                            updateButtonColor16();
                        } else if (flashing16) {
                            updateButtonColor16();
                            showConfirmationDialogYNForButton16();
                        }

                    } else if (yellowThreshold16 <= sec16  && sec16 < redThreshold16) {
                        if(!flashingg16){
                            flashingg16 = true; // 停止黄色闪烁
                            updateButtonColor16();
                        } else if (flashingg16) {
                            updateButtonColor16();
                            showConfirmationDialogYNForButton16();
                        }

                    } else if (sec16 >= redThreshold16) {
                        updateButtonColor16();
                        showConfirmationDialogYNForButton16();
                    }
                }
            }
        });

        btnTimer16.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton16();
                return true;
            }
        });


        btnTimer17 = findViewById(R.id.button17);
        btnTimer17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning17){
                    showConfirmationDialogForButton17();
                    //isTimerRunning17 = true;
                    updateButtonColor17(); // 更新颜色
                } else if (isTimerRunning17) {
                    if (sec17 < blueThreshold17) {
                        updateButtonColor17();
                        showConfirmationDialogYNForButton17();
                    } else if (blueThreshold17 <= sec17  && sec17 < yellowThreshold17  ) {
                        if(!flashing17){
                            flashing17 = true; // 停止蓝色闪烁
                            updateButtonColor17();
                        } else if (flashing17) {
                            updateButtonColor17();
                            showConfirmationDialogYNForButton17();
                        }

                    } else if (yellowThreshold17 <= sec17  && sec17 < redThreshold17) {
                        if(!flashingg17){
                            flashingg17 = true; // 停止黄色闪烁
                            updateButtonColor17();
                        } else if (flashingg17) {
                            updateButtonColor17();
                            showConfirmationDialogYNForButton17();
                        }

                    } else if (sec17 >= redThreshold17) {
                        updateButtonColor17();
                        showConfirmationDialogYNForButton17();
                    }
                }
            }
        });

        btnTimer17.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton17();
                return true;
            }
        });

        btnTimer18 = findViewById(R.id.button18);
        btnTimer18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning18){
                    showConfirmationDialogForButton18();
                    //isTimerRunning18 = true;
                    updateButtonColor18(); // 更新颜色
                } else if (isTimerRunning18) {
                    if (sec18 < blueThreshold18) {
                        updateButtonColor18();
                        showConfirmationDialogYNForButton18();
                    } else if (blueThreshold18 <= sec18  && sec18 < yellowThreshold18  ) {
                        if(!flashing18){
                            flashing18 = true; // 停止蓝色闪烁
                            updateButtonColor18();
                        } else if (flashing18) {
                            updateButtonColor18();
                            showConfirmationDialogYNForButton18();
                        }

                    } else if (yellowThreshold18 <= sec18  && sec18 < redThreshold18) {
                        if(!flashingg18){
                            flashingg18 = true; // 停止黄色闪烁
                            updateButtonColor18();
                        } else if (flashingg18) {
                            updateButtonColor18();
                            showConfirmationDialogYNForButton18();
                        }

                    } else if (sec18 >= redThreshold18) {
                        updateButtonColor18();
                        showConfirmationDialogYNForButton18();
                    }
                }
            }
        });

        btnTimer18.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton18();
                return true;
            }
        });

        btnTimer19 = findViewById(R.id.button19);
        btnTimer19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning19){
                    showConfirmationDialogForButton19();
                    //isTimerRunning19 = true;
                    updateButtonColor19(); // 更新颜色
                } else if (isTimerRunning19) {
                    if (sec19 < blueThreshold19) {
                        updateButtonColor19();
                        showConfirmationDialogYNForButton19();
                    } else if (blueThreshold19 <= sec19  && sec19 < yellowThreshold19  ) {
                        if(!flashing19){
                            flashing19 = true; // 停止蓝色闪烁
                            updateButtonColor19();
                        } else if (flashing19) {
                            updateButtonColor19();
                            showConfirmationDialogYNForButton19();
                        }

                    } else if (yellowThreshold19 <= sec19  && sec19 < redThreshold19) {
                        if(!flashingg19){
                            flashingg19 = true; // 停止黄色闪烁
                            updateButtonColor19();
                        } else if (flashingg19) {
                            updateButtonColor19();
                            showConfirmationDialogYNForButton19();
                        }

                    } else if (sec19 >= redThreshold19) {
                        updateButtonColor19();
                        showConfirmationDialogYNForButton19();
                    }
                }
            }
        });

        btnTimer19.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton19();
                return true;
            }
        });

        btnTimer20 = findViewById(R.id.button20);
        btnTimer20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning20){
                    showConfirmationDialogForButton20();
                    //isTimerRunning20 = true;
                    updateButtonColor20(); // 更新颜色
                } else if (isTimerRunning20) {
                    if (sec20 < blueThreshold20) {
                        updateButtonColor20();
                        showConfirmationDialogYNForButton20();
                    } else if (blueThreshold20 <= sec20  && sec20 < yellowThreshold20  ) {
                        if(!flashing20){
                            flashing20 = true; // 停止蓝色闪烁
                            updateButtonColor20();
                        } else if (flashing20) {
                            updateButtonColor20();
                            showConfirmationDialogYNForButton20();
                        }

                    } else if (yellowThreshold20 <= sec20  && sec20 < redThreshold20) {
                        if(!flashingg20){
                            flashingg20 = true; // 停止黄色闪烁
                            updateButtonColor20();
                        } else if (flashingg20) {
                            updateButtonColor20();
                            showConfirmationDialogYNForButton20();
                        }

                    } else if (sec20 >= redThreshold20) {
                        updateButtonColor20();
                        showConfirmationDialogYNForButton20();
                    }
                }
            }
        });

        btnTimer20.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton20();
                return true;
            }
        });

        btnTimer21 = findViewById(R.id.button21);
        btnTimer21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning21){
                    showConfirmationDialogForButton21();
                    //isTimerRunning21 = true;
                    updateButtonColor21(); // 更新颜色
                } else if (isTimerRunning21) {
                    if (sec21 < blueThreshold21) {
                        updateButtonColor21();
                        showConfirmationDialogYNForButton21();
                    } else if (blueThreshold21 <= sec21  && sec21 < yellowThreshold21  ) {
                        if(!flashing21){
                            flashing21 = true; // 停止蓝色闪烁
                            updateButtonColor21();
                        } else if (flashing21) {
                            updateButtonColor21();
                            showConfirmationDialogYNForButton21();
                        }

                    } else if (yellowThreshold21 <= sec21  && sec21 < redThreshold21) {
                        if(!flashingg21){
                            flashingg21 = true; // 停止黄色闪烁
                            updateButtonColor21();
                        } else if (flashingg21) {
                            updateButtonColor21();
                            showConfirmationDialogYNForButton21();
                        }

                    } else if (sec21 >= redThreshold21) {
                        updateButtonColor21();
                        showConfirmationDialogYNForButton21();
                    }
                }
            }
        });

        btnTimer21.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton21();
                return true;
            }
        });

        btnTimer22 = findViewById(R.id.button22);
        btnTimer22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning22){
                    showConfirmationDialogForButton22();
                    //isTimerRunning22 = true;
                    updateButtonColor22(); // 更新颜色
                } else if (isTimerRunning22) {
                    if (sec22 < blueThreshold22) {
                        updateButtonColor22();
                        showConfirmationDialogYNForButton22();
                    } else if (blueThreshold22 <= sec22  && sec22 < yellowThreshold22  ) {
                        if(!flashing22){
                            flashing22 = true; // 停止蓝色闪烁
                            updateButtonColor22();
                        } else if (flashing22) {
                            updateButtonColor22();
                            showConfirmationDialogYNForButton22();
                        }

                    } else if (yellowThreshold22 <= sec22  && sec22 < redThreshold22) {
                        if(!flashingg22){
                            flashingg22 = true; // 停止黄色闪烁
                            updateButtonColor22();
                        } else if (flashingg22) {
                            updateButtonColor22();
                            showConfirmationDialogYNForButton22();
                        }

                    } else if (sec22 >= redThreshold22) {
                        updateButtonColor22();
                        showConfirmationDialogYNForButton22();
                    }
                }
            }
        });

        btnTimer22.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton22();
                return true;
            }
        });

        btnTimer23 = findViewById(R.id.button23);
        btnTimer23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning23){
                    showConfirmationDialogForButton23();
                    //isTimerRunning23 = true;
                    updateButtonColor23(); // 更新颜色
                } else if (isTimerRunning23) {
                    if (sec23 < blueThreshold23) {
                        updateButtonColor23();
                        showConfirmationDialogYNForButton23();
                    } else if (blueThreshold23 <= sec23  && sec23 < yellowThreshold23  ) {
                        if(!flashing23){
                            flashing23 = true; // 停止蓝色闪烁
                            updateButtonColor23();
                        } else if (flashing23) {
                            updateButtonColor23();
                            showConfirmationDialogYNForButton23();
                        }

                    } else if (yellowThreshold23 <= sec23  && sec23 < redThreshold23) {
                        if(!flashingg23){
                            flashingg23 = true; // 停止黄色闪烁
                            updateButtonColor23();
                        } else if (flashingg23) {
                            updateButtonColor23();
                            showConfirmationDialogYNForButton23();
                        }

                    } else if (sec23 >= redThreshold23) {
                        updateButtonColor23();
                        showConfirmationDialogYNForButton23();
                    }
                }
            }
        });

        btnTimer23.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton23();
                return true;
            }
        });

        btnTimer24 = findViewById(R.id.button24);
        btnTimer24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning24){
                    showConfirmationDialogForButton24();
                    //isTimerRunning24 = true;
                    updateButtonColor24(); // 更新颜色
                } else if (isTimerRunning24) {
                    if (sec24 < blueThreshold24) {
                        updateButtonColor24();
                        showConfirmationDialogYNForButton24();
                    } else if (blueThreshold24 <= sec24  && sec24 < yellowThreshold24  ) {
                        if(!flashing24){
                            flashing24 = true; // 停止蓝色闪烁
                            updateButtonColor24();
                        } else if (flashing24) {
                            updateButtonColor24();
                            showConfirmationDialogYNForButton24();
                        }

                    } else if (yellowThreshold24 <= sec24  && sec24 < redThreshold24) {
                        if(!flashingg24){
                            flashingg24 = true; // 停止黄色闪烁
                            updateButtonColor24();
                        } else if (flashingg24) {
                            updateButtonColor24();
                            showConfirmationDialogYNForButton24();
                        }

                    } else if (sec24 >= redThreshold24) {
                        updateButtonColor24();
                        showConfirmationDialogYNForButton24();
                    }
                }
            }
        });

        btnTimer24.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton24();
                return true;
            }
        });

        btnTimer25 = findViewById(R.id.button25);
        btnTimer25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning25){
                    showConfirmationDialogForButton25();
                    //isTimerRunning25 = true;
                    updateButtonColor25(); // 更新颜色
                } else if (isTimerRunning25) {
                    if (sec25 < blueThreshold25) {
                        updateButtonColor25();
                        showConfirmationDialogYNForButton25();
                    } else if (blueThreshold25 <= sec25  && sec25 < yellowThreshold25  ) {
                        if(!flashing25){
                            flashing25 = true; // 停止蓝色闪烁
                            updateButtonColor25();
                        } else if (flashing25) {
                            updateButtonColor25();
                            showConfirmationDialogYNForButton25();
                        }

                    } else if (yellowThreshold25 <= sec25  && sec25 < redThreshold25) {
                        if(!flashingg25){
                            flashingg25 = true; // 停止黄色闪烁
                            updateButtonColor25();
                        } else if (flashingg25) {
                            updateButtonColor25();
                            showConfirmationDialogYNForButton25();
                        }

                    } else if (sec25 >= redThreshold25) {
                        updateButtonColor25();
                        showConfirmationDialogYNForButton25();
                    }
                }
            }
        });

        btnTimer25.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton25();
                return true;
            }
        });

        btnTimer27RR = findViewById(R.id.button27RR);
        btnTimer27RR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning27RR){
                    showConfirmationDialogForButton27RR();

                    updateButtonColor27RR(); // 更新颜色
                } else if (isTimerRunning27RR) {
                    if (sec27RR < blueThreshold27RR) {
                        updateButtonColor27RR();
                        showConfirmationDialogYNForButton27RR();
                    } else if (blueThreshold27RR <= sec27RR  && sec27RR < yellowThreshold27RR  ) {
                        if(!flashing27RR){
                            flashing27RR = true; // 停止蓝色闪烁
                            updateButtonColor27RR();
                        } else if (flashing27RR) {
                            updateButtonColor27RR();
                            showConfirmationDialogYNForButton27RR();
                        }

                    } else if (yellowThreshold27RR <= sec27RR  && sec27RR < redThreshold27RR) {
                        if(!flashingg27RR){
                            flashingg27RR = true; // 停止黄色闪烁
                            updateButtonColor27RR();
                        } else if (flashingg27RR) {
                            updateButtonColor27RR();
                            showConfirmationDialogYNForButton27RR();
                        }

                    } else if (sec27RR >= redThreshold27RR) {
                        updateButtonColor27RR();
                        showConfirmationDialogYNForButton27RR();
                    }
                }
            }
        });

        btnTimer27RR.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton27RR();
                return true;
            }
        });

        btnTimer28RR = findViewById(R.id.button28RR);
        btnTimer28RR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning28RR){
                    showConfirmationDialogForButton28RR();
                    //isTimerRunning28RR = true;
                    updateButtonColor28RR(); // 更新颜色
                } else if (isTimerRunning28RR) {
                    if (sec28RR < blueThreshold28RR) {
                        updateButtonColor28RR();
                        showConfirmationDialogYNForButton28RR();
                    } else if (blueThreshold28RR <= sec28RR  && sec28RR < yellowThreshold28RR  ) {
                        if(!flashing28RR){
                            flashing28RR = true; // 停止蓝色闪烁
                            updateButtonColor28RR();
                        } else if (flashing28RR) {
                            updateButtonColor28RR();
                            showConfirmationDialogYNForButton28RR();
                        }

                    } else if (yellowThreshold28RR <= sec28RR  && sec28RR < redThreshold28RR) {
                        if(!flashingg28RR){
                            flashingg28RR = true; // 停止黄色闪烁
                            updateButtonColor28RR();
                        } else if (flashingg28RR) {
                            updateButtonColor28RR();
                            showConfirmationDialogYNForButton28RR();
                        }

                    } else if (sec28RR >= redThreshold28RR) {
                        updateButtonColor28RR();
                        showConfirmationDialogYNForButton28RR();
                    }
                }
            }
        });

        btnTimer28RR.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton28RR();
                return true;
            }
        });

        btnTimer66 = findViewById(R.id.button666);
        btnTimer66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning66){
                    showConfirmationDialogForButton66();
                    //isTimerRunning66 = true;
                    updateButtonColor66(); // 更新颜色
                } else if (isTimerRunning66) {
                    if (sec66 < blueThreshold66) {
                        updateButtonColor66();
                        showConfirmationDialogYNForButton66();
                    } else if (blueThreshold66 <= sec66  && sec66 < yellowThreshold66  ) {
                        if(!flashing66){
                            flashing66 = true; // 停止蓝色闪烁
                            updateButtonColor66();
                        } else if (flashing66) {
                            updateButtonColor66();
                            showConfirmationDialogYNForButton66();
                        }

                    } else if (yellowThreshold66 <= sec66  && sec66 < redThreshold66) {
                        if(!flashingg66){
                            flashingg66 = true; // 停止黄色闪烁
                            updateButtonColor66();
                        } else if (flashingg66) {
                            updateButtonColor66();
                            showConfirmationDialogYNForButton66();
                        }

                    } else if (sec66 >= redThreshold66) {
                        updateButtonColor66();
                        showConfirmationDialogYNForButton66();
                    }
                }
            }
        });

        btnTimer66.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton66();
                return true;
            }
        });
        btnTimer201 = findViewById(R.id.button201);
        btnTimer201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning201){
                    showConfirmationDialogForButton201();
                    //isTimerRunning201 = true;
                    updateButtonColor201(); // 更新颜色
                } else if (isTimerRunning201) {
                    if (sec201 < blueThreshold201) {
                        updateButtonColor201();
                        showConfirmationDialogYNForButton201();
                    } else if (blueThreshold201 <= sec201  && sec201 < yellowThreshold201  ) {
                        if(!flashing201){
                            flashing201 = true; // 停止蓝色闪烁
                            updateButtonColor201();
                        } else if (flashing201) {
                            updateButtonColor201();
                            showConfirmationDialogYNForButton201();
                        }

                    } else if (yellowThreshold201 <= sec201  && sec201 < redThreshold201) {
                        if(!flashingg201){
                            flashingg201 = true; // 停止黄色闪烁
                            updateButtonColor201();
                        } else if (flashingg201) {
                            updateButtonColor201();
                            showConfirmationDialogYNForButton201();
                        }

                    } else if (sec201 >= redThreshold201) {
                        updateButtonColor201();
                        showConfirmationDialogYNForButton201();
                    }
                }
            }
        });

        btnTimer201.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton201();
                return true;
            }
        });

        btnTimer202 = findViewById(R.id.button202);
        btnTimer202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning202){
                    showConfirmationDialogForButton202();
                    //isTimerRunning202 = true;
                    updateButtonColor202(); // 更新颜色
                } else if (isTimerRunning202) {
                    if (sec202 < blueThreshold202) {
                        updateButtonColor202();
                        showConfirmationDialogYNForButton202();
                    } else if (blueThreshold202 <= sec202  && sec202 < yellowThreshold202  ) {
                        if(!flashing202){
                            flashing202 = true; // 停止蓝色闪烁
                            updateButtonColor202();
                        } else if (flashing202) {
                            updateButtonColor202();
                            showConfirmationDialogYNForButton202();
                        }

                    } else if (yellowThreshold202 <= sec202  && sec202 < redThreshold202) {
                        if(!flashingg202){
                            flashingg202 = true; // 停止黄色闪烁
                            updateButtonColor202();
                        } else if (flashingg202) {
                            updateButtonColor202();
                            showConfirmationDialogYNForButton202();
                        }

                    } else if (sec202 >= redThreshold202) {
                        updateButtonColor202();
                        showConfirmationDialogYNForButton202();
                    }
                }
            }
        });

        btnTimer202.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton202();
                return true;
            }
        });

        btnTimer203 = findViewById(R.id.button203);
        btnTimer203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning203){
                    showConfirmationDialogForButton203();
                    //isTimerRunning203 = true;
                    updateButtonColor203(); // 更新颜色
                } else if (isTimerRunning203) {
                    if (sec203 < blueThreshold203) {
                        updateButtonColor203();
                        showConfirmationDialogYNForButton203();
                    } else if (blueThreshold203 <= sec203  && sec203 < yellowThreshold203  ) {
                        if(!flashing203){
                            flashing203 = true; // 停止蓝色闪烁
                            updateButtonColor203();
                        } else if (flashing203) {
                            updateButtonColor203();
                            showConfirmationDialogYNForButton203();
                        }

                    } else if (yellowThreshold203 <= sec203  && sec203 < redThreshold203) {
                        if(!flashingg203){
                            flashingg203 = true; // 停止黄色闪烁
                            updateButtonColor203();
                        } else if (flashingg203) {
                            updateButtonColor203();
                            showConfirmationDialogYNForButton203();
                        }

                    } else if (sec203 >= redThreshold203) {
                        updateButtonColor203();
                        showConfirmationDialogYNForButton203();
                    }
                }
            }
        });

        btnTimer203.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton203();
                return true;
            }
        });

        btnTimer204 = findViewById(R.id.button204);
        btnTimer204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning204){
                    showConfirmationDialogForButton204();
                    //isTimerRunning204 = true;
                    updateButtonColor204(); // 更新颜色
                } else if (isTimerRunning204) {
                    if (sec204 < blueThreshold204) {
                        updateButtonColor204();
                        showConfirmationDialogYNForButton204();
                    } else if (blueThreshold204 <= sec204  && sec204 < yellowThreshold204  ) {
                        if(!flashing204){
                            flashing204 = true; // 停止蓝色闪烁
                            updateButtonColor204();
                        } else if (flashing204) {
                            updateButtonColor204();
                            showConfirmationDialogYNForButton204();
                        }

                    } else if (yellowThreshold204 <= sec204  && sec204 < redThreshold204) {
                        if(!flashingg204){
                            flashingg204 = true; // 停止黄色闪烁
                            updateButtonColor204();
                        } else if (flashingg204) {
                            updateButtonColor204();
                            showConfirmationDialogYNForButton204();
                        }

                    } else if (sec204 >= redThreshold204) {
                        updateButtonColor204();
                        showConfirmationDialogYNForButton204();
                    }
                }
            }
        });

        btnTimer204.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton204();
                return true;
            }
        });

        btnTimer26RR = findViewById(R.id.button26RR);
        btnTimer26RR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunning26RR){
                    showConfirmationDialogForButton26RR();

                    updateButtonColor26RR(); // 更新颜色
                } else if (isTimerRunning26RR) {
                    if (sec26RR < blueThreshold26RR) {
                        updateButtonColor26RR();
                        showConfirmationDialogYNForButton26RR();
                    } else if (blueThreshold26RR <= sec26RR  && sec26RR < yellowThreshold26RR  ) {
                        if(!flashing26RR){
                            flashing26RR = true; // 停止蓝色闪烁
                            updateButtonColor26RR();
                        } else if (flashing26RR) {
                            updateButtonColor26RR();
                            showConfirmationDialogYNForButton26RR();
                        }

                    } else if (yellowThreshold26RR <= sec26RR  && sec26RR < redThreshold26RR) {
                        if(!flashingg26RR){
                            flashingg26RR = true; // 停止黄色闪烁
                            updateButtonColor26RR();
                        } else if (flashingg26RR) {
                            updateButtonColor26RR();
                            showConfirmationDialogYNForButton26RR();
                        }

                    } else if (sec26RR >= redThreshold26RR) {
                        updateButtonColor26RR();
                        showConfirmationDialogYNForButton26RR();
                    }
                }
            }
        });

        btnTimer26RR.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton26RR();
                return true;
            }
        });

    }
    //--------------------------------------------------------------------------

    @Override
    public void onDestroy() {
        super.onDestroy();
        handler1.removeCallbacks(updateTimerThread1);
        handler1.removeCallbacks(updateTimerThread2);
        handler1.removeCallbacks(updateTimerThread3);
        handler1.removeCallbacks(updateTimerThread4);
        handler1.removeCallbacks(updateTimerThread5);
        handler1.removeCallbacks(updateTimerThread66);
        handler1.removeCallbacks(updateTimerThread7);
        handler1.removeCallbacks(updateTimerThread8);
        handler1.removeCallbacks(updateTimerThread9);
        handler1.removeCallbacks(updateTimerThread10);
        handler1.removeCallbacks(updateTimerThread11);
        handler1.removeCallbacks(updateTimerThread201);
        handler1.removeCallbacks(updateTimerThread202);
        handler1.removeCallbacks(updateTimerThread203);
        handler1.removeCallbacks(updateTimerThread204);
        handler1.removeCallbacks(updateTimerThread16);
        handler1.removeCallbacks(updateTimerThread17);
        handler1.removeCallbacks(updateTimerThread18);
        handler1.removeCallbacks(updateTimerThread19);
        handler1.removeCallbacks(updateTimerThread20);
        handler1.removeCallbacks(updateTimerThread21);
        handler1.removeCallbacks(updateTimerThread22);
        handler1.removeCallbacks(updateTimerThread23);
        handler1.removeCallbacks(updateTimerThread24);
        handler1.removeCallbacks(updateTimerThread25);
        //handler1.removeCallbacks(updateTimerThread266);
        handler1.removeCallbacks(updateTimerThread27RR);
        handler1.removeCallbacks(updateTimerThread28RR);
        handler1.removeCallbacks(updateTimerThread26RR);


        // 停止計時器服務
        Intent timerServiceIntent = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent);
        // 停止計時器服務
        Intent timerServiceIntent1 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent1);

        Intent timerServiceIntent2 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent2);

        Intent timerServiceIntent3 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent3);

        Intent timerServiceIntent4 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent4);

        Intent timerServiceIntent5 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent5);

        Intent timerServiceIntent6 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent6);

        Intent timerServiceIntent7 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent7);

        Intent timerServiceIntent8 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent8);

        Intent timerServiceIntent9 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent9);

        Intent timerServiceIntent10 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent10);

        Intent timerServiceIntent11 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent11);

        Intent timerServiceIntent12 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent12);

        Intent timerServiceIntent13 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent13);

        Intent timerServiceIntent14 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent14);

        Intent timerServiceIntent15 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent15);

        Intent timerServiceIntent16 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent16);

        Intent timerServiceIntent17 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent17);

        Intent timerServiceIntent18 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent18);

        Intent timerServiceIntent19 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent19);

        Intent timerServiceIntent20 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent20);

        Intent timerServiceIntent21 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent21);

        Intent timerServiceIntent22 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent22);

        Intent timerServiceIntent23 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent23);

        Intent timerServiceIntent24 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent24);

        Intent timerServiceIntent25 = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent25);

        //Intent timerServiceIntent266 = new Intent(this, TimerServiceS1.class);
        //stopService(timerServiceIntent266);

        Intent timerServiceIntent27RR = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent27RR);

        Intent timerServiceIntent28RR = new Intent(this,TimerServiceS1.class);
        stopService(timerServiceIntent28RR);

        Intent timerServiceIntent66 = new Intent(this,TimerServiceS1.class);
        stopService(timerServiceIntent66);

        Intent timerServiceIntent26RR = new Intent(this, TimerServiceS1.class);
        stopService(timerServiceIntent26RR);

    }


    @Override
    public void onPause() {
        super.onPause();


        // 在保存計時器1狀態時，使用editor1對象進行同步
        synchronized (editor1) {
            editor1.putBoolean(TIMER_STARTED_KEY1, handler1.hasCallbacks(updateTimerThread1));
            editor1.putLong(START_TIME_KEY1, startTime1);
            editor1.putLong(ELAPSED_TIME_KEY1, timeInMilliseconds1);
            editor1.putBoolean("people_key1", people2_1);
            editor1.putBoolean("flashing_key1", flashing1);
            editor1.putBoolean("flashingg_key1", flashingg1);
            editor1.putBoolean("isTimerRunning1", isTimerRunning1);
            editor1.putInt("currentHour1",currentHour1);
            editor1.putInt("currentMinute1",currentMinute1);

            // 保存加時時間到SharedPreferences
            editor1.putInt("blueThreshold1", blueThreshold1);
            editor1.putInt("yellowThreshold1", yellowThreshold1);
            editor1.putInt("redThreshold1", redThreshold1);
            editor1.apply();
        }

        // 在保存計時器2狀態時，使用editor2對象進行同步
        synchronized (editor2) {
            editor2.putBoolean(TIMER_STARTED_KEY2, handler1.hasCallbacks(updateTimerThread2));
            editor2.putLong(START_TIME_KEY2, startTime2);
            editor2.putLong(ELAPSED_TIME_KEY2, timeInMilliseconds2);
            editor2.putBoolean("people_key2", people2_2);


            editor2.putBoolean("flashing_key2", flashing2);
            editor2.putBoolean("flashingg_key2", flashingg2);
            editor2.putBoolean("isTimerRunning2", isTimerRunning2);
            editor2.putInt("currentHour2", currentHour2);
            editor2.putInt("currentMinute2", currentMinute2);


            // 保存加時時間到SharedPreferences
            editor2.putInt("blueThreshold2", blueThreshold2);
            editor2.putInt("yellowThreshold2", yellowThreshold2);
            editor2.putInt("redThreshold2", redThreshold2);
            editor2.apply();
        }

        synchronized (editor3) {
            editor3.putBoolean(TIMER_STARTED_KEY3, handler1.hasCallbacks(updateTimerThread3));
            editor3.putLong(START_TIME_KEY3, startTime3);
            editor3.putLong(ELAPSED_TIME_KEY3, timeInMilliseconds3);
            editor3.putBoolean("people_key3", people2_3);

            editor3.putBoolean("flashing_key3", flashing3);
            editor3.putBoolean("flashingg_key3", flashingg3);
            editor3.putBoolean("isTimerRunning3", isTimerRunning3);
            editor3.putInt("currentHour3", currentHour3);
            editor3.putInt("currentMinute3", currentMinute3);


            // 保存加時時間到SharedPreferences
            editor3.putInt("blueThreshold3", blueThreshold3);
            editor3.putInt("yellowThreshold3", yellowThreshold3);
            editor3.putInt("redThreshold3", redThreshold3);
            editor3.apply();
        }

        synchronized (editor4) {
            editor4.putBoolean(TIMER_STARTED_KEY4, handler1.hasCallbacks(updateTimerThread4));
            editor4.putLong(START_TIME_KEY4, startTime4);
            editor4.putLong(ELAPSED_TIME_KEY4, timeInMilliseconds4);
            editor4.putBoolean("people_key4", people2_4);

            editor4.putBoolean("flashing_key4", flashing4);
            editor4.putBoolean("flashingg_key4", flashingg4);
            editor4.putBoolean("isTimerRunning4", isTimerRunning4);
            editor4.putInt("currentHour4", currentHour4);
            editor4.putInt("currentMinute4", currentMinute4);


            // 保存加時時間到SharedPreferences
            editor4.putInt("blueThreshold4", blueThreshold4);
            editor4.putInt("yellowThreshold4", yellowThreshold4);
            editor4.putInt("redThreshold4", redThreshold4);
            editor4.apply();
        }

        synchronized (editor5) {
            editor5.putBoolean(TIMER_STARTED_KEY5, handler1.hasCallbacks(updateTimerThread5));
            editor5.putLong(START_TIME_KEY5, startTime5);
            editor5.putLong(ELAPSED_TIME_KEY5, timeInMilliseconds5);
            editor5.putBoolean("people_key5", people2_5);

            editor5.putBoolean("flashing_key5", flashing5);
            editor5.putBoolean("flashingg_key5", flashingg5);
            editor5.putBoolean("isTimerRunning5", isTimerRunning5);
            editor5.putInt("currentHour5", currentHour5);
            editor5.putInt("currentMinute5", currentMinute5);


// 保存加時時間到SharedPreferences
            editor5.putInt("blueThreshold5", blueThreshold5);
            editor5.putInt("yellowThreshold5", yellowThreshold5);
            editor5.putInt("redThreshold5", redThreshold5);
            editor5.apply();
        }



        synchronized (editor7) {
            editor7.putBoolean(TIMER_STARTED_KEY7, handler1.hasCallbacks(updateTimerThread7));
            editor7.putLong(START_TIME_KEY7, startTime7);
            editor7.putLong(ELAPSED_TIME_KEY7, timeInMilliseconds7);
            editor7.putBoolean("people_key7", people2_7);

            editor7.putBoolean("flashing_key7", flashing7);
            editor7.putBoolean("flashingg_key7", flashingg7);
            editor7.putBoolean("isTimerRunning7", isTimerRunning7);

            editor7.putInt("currentHour7", currentHour7);
            editor7.putInt("currentMinute7", currentMinute7);


            // 保存加時時間到SharedPreferences
            editor7.putInt("blueThreshold7", blueThreshold7);
            editor7.putInt("yellowThreshold7", yellowThreshold7);
            editor7.putInt("redThreshold7", redThreshold7);
            editor7.apply();
        }

        synchronized (editor8) {
            editor8.putBoolean(TIMER_STARTED_KEY8, handler1.hasCallbacks(updateTimerThread8));
            editor8.putLong(START_TIME_KEY8, startTime8);
            editor8.putLong(ELAPSED_TIME_KEY8, timeInMilliseconds8);
            editor8.putBoolean("people_key8", people2_8);

            editor8.putBoolean("flashing_key8", flashing8);
            editor8.putBoolean("flashingg_key8", flashingg8);
            editor8.putBoolean("isTimerRunning8", isTimerRunning8);
            editor8.putInt("currentHour8", currentHour8);
            editor8.putInt("currentMinute8", currentMinute8);


// 保存加時時間到SharedPreferences
            editor8.putInt("blueThreshold8", blueThreshold8);
            editor8.putInt("yellowThreshold8", yellowThreshold8);
            editor8.putInt("redThreshold8", redThreshold8);
            editor8.apply();
        }

        synchronized (editor9) {
            editor9.putBoolean(TIMER_STARTED_KEY9, handler1.hasCallbacks(updateTimerThread9));
            editor9.putLong(START_TIME_KEY9, startTime9);
            editor9.putLong(ELAPSED_TIME_KEY9, timeInMilliseconds9);
            editor9.putBoolean("people_key9", people2_9);

            editor9.putBoolean("flashing_key9", flashing9);
            editor9.putBoolean("flashingg_key9", flashingg9);
            editor9.putBoolean("isTimerRunning9", isTimerRunning9);
            editor9.putInt("currentHour9", currentHour9);
            editor9.putInt("currentMinute9", currentMinute9);


            editor9.putInt("blueThreshold9", blueThreshold9);
            editor9.putInt("yellowThreshold9", yellowThreshold9);
            editor9.putInt("redThreshold9", redThreshold9);
            editor9.apply();
        }

        synchronized (editor10) {
            editor10.putBoolean(TIMER_STARTED_KEY10, handler1.hasCallbacks(updateTimerThread10));
            editor10.putLong(START_TIME_KEY10, startTime10);
            editor10.putLong(ELAPSED_TIME_KEY10, timeInMilliseconds10);
            editor10.putBoolean("people_key10", people2_10);

            editor10.putBoolean("flashing_key10", flashing10);
            editor10.putBoolean("flashingg_key10", flashingg10);
            editor10.putBoolean("isTimerRunning10", isTimerRunning10);
            editor10.putInt("currentHour10", currentHour10);
            editor10.putInt("currentMinute10", currentMinute10);


            editor10.putInt("blueThreshold10", blueThreshold10);
            editor10.putInt("yellowThreshold10", yellowThreshold10);
            editor10.putInt("redThreshold10", redThreshold10);
            editor10.apply();
        }

        synchronized (editor11) {
            editor11.putBoolean(TIMER_STARTED_KEY11, handler1.hasCallbacks(updateTimerThread11));
            editor11.putLong(START_TIME_KEY11, startTime11);
            editor11.putLong(ELAPSED_TIME_KEY11, timeInMilliseconds11);
            editor11.putBoolean("people_key11", people2_11);

            editor11.putBoolean("flashing_key11", flashing11);
            editor11.putBoolean("flashingg_key11", flashingg11);
            editor11.putBoolean("isTimerRunning11", isTimerRunning11);
            editor11.putInt("currentHour11", currentHour11);
            editor11.putInt("currentMinute11", currentMinute11);



            editor11.putInt("blueThreshold11", blueThreshold11);
            editor11.putInt("yellowThreshold11", yellowThreshold11);
            editor11.putInt("redThreshold11", redThreshold11);
            editor11.apply();
        }

        synchronized (editor12) {
            editor12.putBoolean(TIMER_STARTED_KEY12, handler1.hasCallbacks(updateTimerThread201));
            editor12.putLong(START_TIME_KEY12, startTime201);
            editor12.putLong(ELAPSED_TIME_KEY12, timeInMilliseconds201);
            editor12.putBoolean("people_key12", people2_12);

            editor12.putBoolean("flashing_key12", flashing201);
            editor12.putBoolean("flashingg_key12", flashingg201);
            editor12.putBoolean("isTimerRunning12", isTimerRunning201);
            editor12.putInt("currentHour12", currentHour12);
            editor12.putInt("currentMinute12", currentMinute12);


            editor12.putInt("blueThreshold12", blueThreshold201);
            editor12.putInt("yellowThreshold12", yellowThreshold201);
            editor12.putInt("redThreshold12", redThreshold201);
            editor12.apply();
        }

        synchronized (editor13) {
            editor13.putBoolean(TIMER_STARTED_KEY13, handler1.hasCallbacks(updateTimerThread202));
            editor13.putLong(START_TIME_KEY13, startTime202);
            editor13.putLong(ELAPSED_TIME_KEY13, timeInMilliseconds202);
            editor13.putBoolean("people_key13", people2_13);

            editor13.putBoolean("flashing_key13", flashing202);
            editor13.putBoolean("flashingg_key13", flashingg202);
            editor13.putBoolean("isTimerRunning13", isTimerRunning202);
            editor13.putInt("currentHour13", currentHour13);
            editor13.putInt("currentMinute13", currentMinute13);


            editor13.putInt("blueThreshold13", blueThreshold202);
            editor13.putInt("yellowThreshold13", yellowThreshold202);
            editor13.putInt("redThreshold13", redThreshold202);
            editor13.apply();
        }

        synchronized (editor14) {
            editor14.putBoolean(TIMER_STARTED_KEY14, handler1.hasCallbacks(updateTimerThread203));
            editor14.putLong(START_TIME_KEY14, startTime203);
            editor14.putLong(ELAPSED_TIME_KEY14, timeInMilliseconds203);
            editor14.putBoolean("people_key14", people2_14);

            editor14.putBoolean("flashing_key14", flashing203);
            editor14.putBoolean("flashingg_key14", flashingg203);
            editor14.putBoolean("isTimerRunning14", isTimerRunning203);
            editor14.putInt("currentHour14", currentHour14);
            editor14.putInt("currentMinute14", currentMinute14);


            editor14.putInt("blueThreshold14", blueThreshold203);
            editor14.putInt("yellowThreshold14", yellowThreshold203);
            editor14.putInt("redThreshold14", redThreshold203);
            editor14.apply();
        }

        synchronized (editor15) {
            editor15.putBoolean(TIMER_STARTED_KEY15, handler1.hasCallbacks(updateTimerThread204));
            editor15.putLong(START_TIME_KEY15, startTime204);
            editor15.putLong(ELAPSED_TIME_KEY15, timeInMilliseconds204);
            editor15.putBoolean("people_key15", people2_15);

            editor15.putBoolean("flashing_key15", flashing204);
            editor15.putBoolean("flashingg_key15", flashingg204);
            editor15.putBoolean("isTimerRunning15", isTimerRunning204);
            editor15.putInt("currentHour15", currentHour15);
            editor15.putInt("currentMinute15", currentMinute15);


            editor15.putInt("blueThreshold15", blueThreshold204);
            editor15.putInt("yellowThreshold15", yellowThreshold204);
            editor15.putInt("redThreshold15", redThreshold204);
            editor15.apply();
        }

        synchronized (editor16) {
            editor16.putBoolean(TIMER_STARTED_KEY16, handler1.hasCallbacks(updateTimerThread16));
            editor16.putLong(START_TIME_KEY16, startTime16);
            editor16.putLong(ELAPSED_TIME_KEY16, timeInMilliseconds16);
            editor16.putBoolean("people_key16", people2_16);

            editor16.putBoolean("flashing_key16", flashing16);
            editor16.putBoolean("flashingg_key16", flashingg16);
            editor16.putBoolean("isTimerRunning16", isTimerRunning16);
            editor16.putInt("currentHour16", currentHour16);
            editor16.putInt("currentMinute16", currentMinute16);


            editor16.putInt("blueThreshold16", blueThreshold16);
            editor16.putInt("yellowThreshold16", yellowThreshold16);
            editor16.putInt("redThreshold16", redThreshold16);
            editor16.apply();
        }

        synchronized (editor17) {
            editor17.putBoolean(TIMER_STARTED_KEY17, handler1.hasCallbacks(updateTimerThread17));
            editor17.putLong(START_TIME_KEY17, startTime17);
            editor17.putLong(ELAPSED_TIME_KEY17, timeInMilliseconds17);
            editor17.putBoolean("people_key17", people2_17);

            editor17.putBoolean("flashing_key17", flashing17);
            editor17.putBoolean("flashingg_key17", flashingg17);
            editor17.putBoolean("isTimerRunning17", isTimerRunning17);
            editor17.putInt("currentHour17", currentHour17);
            editor17.putInt("currentMinute17", currentMinute17);


            editor17.putInt("blueThreshold17", blueThreshold17);
            editor17.putInt("yellowThreshold17", yellowThreshold17);
            editor17.putInt("redThreshold17", redThreshold17);
            editor17.apply();
        }

        synchronized (editor18) {
            editor18.putBoolean(TIMER_STARTED_KEY18, handler1.hasCallbacks(updateTimerThread18));
            editor18.putLong(START_TIME_KEY18, startTime18);
            editor18.putLong(ELAPSED_TIME_KEY18, timeInMilliseconds18);
            editor18.putBoolean("people_key18", people2_18);

            editor18.putBoolean("flashing_key18", flashing18);
            editor18.putBoolean("flashingg_key18", flashingg18);
            editor18.putBoolean("isTimerRunning18", isTimerRunning18);
            editor18.putInt("currentHour18", currentHour18);
            editor18.putInt("currentMinute18", currentMinute18);


            editor18.putInt("blueThreshold18", blueThreshold18);
            editor18.putInt("yellowThreshold18", yellowThreshold18);
            editor18.putInt("redThreshold18", redThreshold18);
            editor18.apply();
        }

        synchronized (editor19) {
            editor19.putBoolean(TIMER_STARTED_KEY19, handler1.hasCallbacks(updateTimerThread19));
            editor19.putLong(START_TIME_KEY19, startTime19);
            editor19.putLong(ELAPSED_TIME_KEY19, timeInMilliseconds19);
            editor19.putBoolean("people_key19", people2_19);

            editor19.putBoolean("flashing_key19", flashing19);
            editor19.putBoolean("flashingg_key19", flashingg19);
            editor19.putBoolean("isTimerRunning19", isTimerRunning19);
            editor19.putInt("currentHour19", currentHour19);
            editor19.putInt("currentMinute19", currentMinute19);


            editor19.putInt("blueThreshold19", blueThreshold19);
            editor19.putInt("yellowThreshold19", yellowThreshold19);
            editor19.putInt("redThreshold19", redThreshold19);
            editor19.apply();
        }

        synchronized (editor20) {
            editor20.putBoolean(TIMER_STARTED_KEY20, handler1.hasCallbacks(updateTimerThread20));
            editor20.putLong(START_TIME_KEY20, startTime20);
            editor20.putLong(ELAPSED_TIME_KEY20, timeInMilliseconds20);
            editor20.putBoolean("people_key20", people2_20);

            editor20.putBoolean("flashing_key20", flashing20);
            editor20.putBoolean("flashingg_key20", flashingg20);
            editor20.putBoolean("isTimerRunning20", isTimerRunning20);
            editor20.putInt("currentHour20", currentHour20);
            editor20.putInt("currentMinute20", currentMinute20);



            editor20.putInt("blueThreshold20", blueThreshold20);
            editor20.putInt("yellowThreshold20", yellowThreshold20);
            editor20.putInt("redThreshold20", redThreshold20);
            editor20.apply();
        }

        synchronized (editor21) {
            editor21.putBoolean(TIMER_STARTED_KEY21, handler1.hasCallbacks(updateTimerThread21));
            editor21.putLong(START_TIME_KEY21, startTime21);
            editor21.putLong(ELAPSED_TIME_KEY21, timeInMilliseconds21);
            editor21.putBoolean("people_key21", people2_21);

            editor21.putBoolean("flashing_key21", flashing21);
            editor21.putBoolean("flashingg_key21", flashingg21);
            editor21.putBoolean("isTimerRunning21", isTimerRunning21);
            editor21.putInt("currentHour21", currentHour21);
            editor21.putInt("currentMinute21", currentMinute21);


            editor21.putInt("blueThreshold21", blueThreshold21);
            editor21.putInt("yellowThreshold21", yellowThreshold21);
            editor21.putInt("redThreshold21", redThreshold21);
            editor21.apply();
        }

        synchronized (editor22) {
            editor22.putBoolean(TIMER_STARTED_KEY22, handler1.hasCallbacks(updateTimerThread22));
            editor22.putLong(START_TIME_KEY22, startTime22);
            editor22.putLong(ELAPSED_TIME_KEY22, timeInMilliseconds22);
            editor22.putBoolean("people_key22", people2_22);

            editor22.putBoolean("flashing_key22", flashing22);
            editor22.putBoolean("flashingg_key22", flashingg22);
            editor22.putBoolean("isTimerRunning22", isTimerRunning22);
            editor22.putInt("currentHour22", currentHour22);
            editor22.putInt("currentMinute22", currentMinute22);


// 保存加時時間到SharedPreferences
            editor22.putInt("blueThreshold22", blueThreshold22);
            editor22.putInt("yellowThreshold22", yellowThreshold22);
            editor22.putInt("redThreshold22", redThreshold22);
            editor22.apply();
        }

        synchronized (editor23) {
            editor23.putBoolean(TIMER_STARTED_KEY23, handler1.hasCallbacks(updateTimerThread23));
            editor23.putLong(START_TIME_KEY23, startTime23);
            editor23.putLong(ELAPSED_TIME_KEY23, timeInMilliseconds23);
            editor23.putBoolean("people_key23", people2_23);

            editor23.putBoolean("flashing_key23", flashing23);
            editor23.putBoolean("flashingg_key23", flashingg23);
            editor23.putBoolean("isTimerRunning23", isTimerRunning23);
            editor23.putInt("currentHour23", currentHour23);
            editor23.putInt("currentMinute23", currentMinute23);


            editor23.putInt("blueThreshold23", blueThreshold23);
            editor23.putInt("yellowThreshold23", yellowThreshold23);
            editor23.putInt("redThreshold23", redThreshold23);
            editor23.apply();
        }

        synchronized (editor24) {
            editor24.putBoolean(TIMER_STARTED_KEY24, handler1.hasCallbacks(updateTimerThread24));
            editor24.putLong(START_TIME_KEY24, startTime24);
            editor24.putLong(ELAPSED_TIME_KEY24, timeInMilliseconds24);
            editor24.putBoolean("people_key24", people2_24);

            editor24.putBoolean("flashing_key24", flashing24);
            editor24.putBoolean("flashingg_key24", flashingg24);
            editor24.putBoolean("isTimerRunning24", isTimerRunning24);
            editor24.putInt("currentHour24", currentHour24);
            editor24.putInt("currentMinute24", currentMinute24);


            editor24.putInt("blueThreshold24", blueThreshold24);
            editor24.putInt("yellowThreshold24", yellowThreshold24);
            editor24.putInt("redThreshold24", redThreshold24);
            editor24.apply();
        }

        synchronized (editor25) {
            editor25.putBoolean(TIMER_STARTED_KEY25, handler1.hasCallbacks(updateTimerThread25));
            editor25.putLong(START_TIME_KEY25, startTime25);
            editor25.putLong(ELAPSED_TIME_KEY25, timeInMilliseconds25);
            editor25.putBoolean("people_key25", people2_25);

            editor25.putBoolean("flashing_key25", flashing25);
            editor25.putBoolean("flashingg_key25", flashingg25);
            editor25.putBoolean("isTimerRunning25", isTimerRunning25);
            editor25.putInt("currentHour25", currentHour25);
            editor25.putInt("currentMinute25", currentMinute25);


            editor25.putInt("blueThreshold25", blueThreshold25);
            editor25.putInt("yellowThreshold25", yellowThreshold25);
            editor25.putInt("redThreshold25", redThreshold25);
            editor25.apply();
        }
/*
        synchronized (editor266) {
            editor266.putBoolean(TIMER_STARTED_KEY266, handler1.hasCallbacks(updateTimerThread266));
            editor266.putLong(START_TIME_KEY266, startTime266);
            editor266.putLong(ELAPSED_TIME_KEY266, timeInMilliseconds266);
            editor266.putBoolean("people_key266", people2_266);

            editor266.putBoolean("flashing_key266", flashing266);
            editor266.putBoolean("flashingg_key266", flashingg266);
            editor266.putBoolean("isTimerRunning266", isTimerRunning266);
            editor266.putInt("currentHour266", currentHour266);
            editor266.putInt("currentMinute266", currentMinute266);


            editor266.putInt("blueThreshold266", blueThreshold266);
            editor266.putInt("yellowThreshold2662", yellowThreshold266);
            editor266.putInt("redThreshold266", redThreshold266);
            editor266.apply();
        }*/

        synchronized (editor27RR) {
            editor27RR.putBoolean(TIMER_STARTED_KEY27RR, handler1.hasCallbacks(updateTimerThread27RR));
            editor27RR.putLong(START_TIME_KEY27RR, startTime27RR);
            editor27RR.putLong(ELAPSED_TIME_KEY27RR, timeInMilliseconds27RR);
            editor27RR.putBoolean("people_key27RR", people2_27RR);

            editor27RR.putBoolean("flashing_key27RR", flashing27RR);
            editor27RR.putBoolean("flashingg_key27RR", flashingg27RR);
            editor27RR.putBoolean("isTimerRunning27RR", isTimerRunning27RR);
            editor27RR.putInt("currentHour27RR", currentHour27RR);
            editor27RR.putInt("currentMinute27RR", currentMinute27RR);


            editor27RR.putInt("blueThreshold27RR", blueThreshold27RR);
            editor27RR.putInt("yellowThreshold27RR", yellowThreshold27RR);
            editor27RR.putInt("redThreshold27RR", redThreshold27RR);
            editor27RR.apply();
        }

        synchronized (editor28RR) {
            editor28RR.putBoolean(TIMER_STARTED_KEY28RR, handler1.hasCallbacks(updateTimerThread28RR));
            editor28RR.putLong(START_TIME_KEY28RR, startTime28RR);
            editor28RR.putLong(ELAPSED_TIME_KEY28RR, timeInMilliseconds28RR);
            editor28RR.putBoolean("people_key28RR", people2_28RR);

            editor28RR.putBoolean("flashing_key28RR", flashing28RR);
            editor28RR.putBoolean("flashingg_key28RR", flashingg28RR);
            editor28RR.putBoolean("isTimerRunning28RR", isTimerRunning28RR);
            editor28RR.putInt("currentHour28RR", currentHour28RR);
            editor28RR.putInt("currentMinute28RR", currentMinute28RR);


            editor28RR.putInt("blueThreshold28RR", blueThreshold28RR);
            editor28RR.putInt("yellowThreshold28RR", yellowThreshold28RR);
            editor28RR.putInt("redThreshold28RR", redThreshold28RR);
            editor28RR.apply();
        }
        synchronized (editor66) {
            editor66.putBoolean(TIMER_STARTED_KEY66, handler1.hasCallbacks(updateTimerThread66));
            editor66.putLong(START_TIME_KEY66, startTime66);
            editor66.putLong(ELAPSED_TIME_KEY66, timeInMilliseconds66);
            editor66.putBoolean("people_key66", people2_66);

            editor66.putBoolean("flashing_key66", flashing66);
            editor66.putBoolean("flashingg_key66", flashingg66);
            editor66.putBoolean("isTimerRunning66", isTimerRunning66);
            editor66.putInt("currentHour66", currentHour66);
            editor66.putInt("currentMinute66", currentMinute66);


            editor66.putInt("blueThreshold66", blueThreshold66);
            editor66.putInt("yellowThreshold66", yellowThreshold66);
            editor66.putInt("redThreshold66", redThreshold66);
            editor66.apply();
        }
        // 在保存計時器26RR狀態時，使用editor26RR對象進行同步
        synchronized (editor26RR) {
            editor26RR.putBoolean(TIMER_STARTED_KEY26RR, handler1.hasCallbacks(updateTimerThread26RR));
            editor26RR.putLong(START_TIME_KEY26RR, startTime26RR);
            editor26RR.putLong(ELAPSED_TIME_KEY26RR, timeInMilliseconds26RR);
            editor26RR.putBoolean("people_key26RR", people2_26RR);
            editor26RR.putBoolean("flashing_key26RR", flashing26RR);
            editor26RR.putBoolean("flashingg_key26RR", flashingg26RR);
            editor26RR.putBoolean("isTimerRunning26RR", isTimerRunning26RR);
            editor26RR.putInt("currentHour26RR",currentHour26RR);
            editor26RR.putInt("currentMinute26RR",currentMinute26RR);

            // 保存加時時間到SharedPreferences
            editor26RR.putInt("blueThreshold26RR", blueThreshold26RR);
            editor26RR.putInt("yellowThreshold26RR", yellowThreshold26RR);
            editor26RR.putInt("redThreshold26RR", redThreshold26RR);
            editor26RR.apply();
        }


    }

    @Override
    public void onResume() {
        super.onResume();

        synchronized (editor1) {
            boolean timerStarted1 = sharedPreferences1.getBoolean(TIMER_STARTED_KEY1, false);
            if (timerStarted1) {
                startTime1 = sharedPreferences1.getLong(START_TIME_KEY1, 0);
                timeInMilliseconds1 = sharedPreferences1.getLong(ELAPSED_TIME_KEY1, 0);
                sec1 = (int) (timeInMilliseconds1 / 1000);
                handler1.postDelayed(updateTimerThread1, 0);
            }
            people2_1 = sharedPreferences1.getBoolean("people_key1", false);
            flashing1 = sharedPreferences1.getBoolean("flashing_key1", false);
            flashingg1 = sharedPreferences1.getBoolean("flashingg_key1", false);
            isTimerRunning1 = sharedPreferences1.getBoolean("isTimerRunning1", false);
            currentHour1 = sharedPreferences1.getInt("currentHour1",currentHour1);
            currentMinute1 = sharedPreferences1.getInt("currentMinute1",currentMinute1);

            // 恢复加時時間  測試用
            blueThreshold1 = sharedPreferences1.getInt("blueThreshold1", originalblueThreshold2);
            yellowThreshold1 = sharedPreferences1.getInt("yellowThreshold1", originalyellowThreshold2);
            redThreshold1 = sharedPreferences1.getInt("redThreshold1", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor1();
        }

        synchronized (editor2) {
            boolean timerStarted2 = sharedPreferences2.getBoolean(TIMER_STARTED_KEY2, false);
            if (timerStarted2) {
                startTime2 = sharedPreferences2.getLong(START_TIME_KEY2, 0);
                timeInMilliseconds2 = sharedPreferences2.getLong(ELAPSED_TIME_KEY2, 0);
                sec2 = (int) (timeInMilliseconds2 / 1000);
                handler1.postDelayed(updateTimerThread2, 0);
            }
            people2_2 = sharedPreferences2.getBoolean("people_key2", false);
            flashing2 = sharedPreferences2.getBoolean("flashing_key2", false);
            flashingg2 = sharedPreferences2.getBoolean("flashingg_key2", false);
            isTimerRunning2 = sharedPreferences2.getBoolean("isTimerRunning2", false);
            currentHour2 = sharedPreferences2.getInt("currentHour2", currentHour2);
            currentMinute2 = sharedPreferences2.getInt("currentMinute2", currentMinute2);




            // 恢复加時時間
            blueThreshold2 = sharedPreferences2.getInt("blueThreshold2", originalblueThreshold2);
            yellowThreshold2 = sharedPreferences2.getInt("yellowThreshold2", originalyellowThreshold2);
            redThreshold2 = sharedPreferences2.getInt("redThreshold2", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor2();
        }

        synchronized (editor3) {
            boolean timerStarted3 = sharedPreferences3.getBoolean(TIMER_STARTED_KEY3, false);
            if (timerStarted3) {
                startTime3 = sharedPreferences3.getLong(START_TIME_KEY3, 0);
                timeInMilliseconds3 = sharedPreferences3.getLong(ELAPSED_TIME_KEY3, 0);
                sec3 = (int) (timeInMilliseconds3 / 1000);
                handler1.postDelayed(updateTimerThread3, 0);
            }
            people2_3 = sharedPreferences3.getBoolean("people_key3", false);
            flashing3 = sharedPreferences3.getBoolean("flashing_key3", false);
            flashingg3 = sharedPreferences3.getBoolean("flashingg_key3", false);
            isTimerRunning3 = sharedPreferences3.getBoolean("isTimerRunning3", false);
            currentHour3 = sharedPreferences3.getInt("currentHour3", currentHour3);
            currentMinute3 = sharedPreferences3.getInt("currentMinute3", currentMinute3);




            // 恢复加時時間
            blueThreshold3 = sharedPreferences3.getInt("blueThreshold3", originalblueThreshold2);
            yellowThreshold3 = sharedPreferences3.getInt("yellowThreshold3", originalyellowThreshold2);
            redThreshold3 = sharedPreferences3.getInt("redThreshold3", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor3();
        }

        synchronized (editor4) {
            boolean timerStarted4 = sharedPreferences4.getBoolean(TIMER_STARTED_KEY4, false);
            if (timerStarted4) {
                startTime4 = sharedPreferences4.getLong(START_TIME_KEY4, 0);
                timeInMilliseconds4 = sharedPreferences4.getLong(ELAPSED_TIME_KEY4, 0);
                sec4 = (int) (timeInMilliseconds4 / 1000);
                handler1.postDelayed(updateTimerThread4, 0);
            }
            people2_4 = sharedPreferences4.getBoolean("people_key4", false);
            flashing4 = sharedPreferences4.getBoolean("flashing_key4", false);
            flashingg4 = sharedPreferences4.getBoolean("flashingg_key4", false);
            isTimerRunning4 = sharedPreferences4.getBoolean("isTimerRunning4", false);
            currentHour4 = sharedPreferences4.getInt("currentHour4", currentHour4);
            currentMinute4 = sharedPreferences4.getInt("currentMinute4", currentMinute4);



            // 恢复加時時間
            blueThreshold4 = sharedPreferences4.getInt("blueThreshold4", originalblueThreshold2);
            yellowThreshold4 = sharedPreferences4.getInt("yellowThreshold4", originalyellowThreshold2);
            redThreshold4 = sharedPreferences4.getInt("redThreshold4", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor4();
        }

        synchronized (editor5) {
            boolean timerStarted5 = sharedPreferences5.getBoolean(TIMER_STARTED_KEY5, false);
            if (timerStarted5) {
                startTime5 = sharedPreferences5.getLong(START_TIME_KEY5, 0);
                timeInMilliseconds5 = sharedPreferences5.getLong(ELAPSED_TIME_KEY5, 0);
                sec5 = (int) (timeInMilliseconds5 / 1000);
                handler1.postDelayed(updateTimerThread5, 0);
            }
            people2_5 = sharedPreferences5.getBoolean("people_key5", false);
            flashing5 = sharedPreferences5.getBoolean("flashing_key5", false);
            flashingg5 = sharedPreferences5.getBoolean("flashingg_key5", false);
            isTimerRunning5 = sharedPreferences5.getBoolean("isTimerRunning5", false);
            currentHour5 = sharedPreferences5.getInt("currentHour5", currentHour5);
            currentMinute5 = sharedPreferences5.getInt("currentMinute5", currentMinute5);




            // 恢复加時時間
            blueThreshold5 = sharedPreferences5.getInt("blueThreshold5", originalblueThreshold2);
            yellowThreshold5 = sharedPreferences5.getInt("yellowThreshold5", originalyellowThreshold2);
            redThreshold5 = sharedPreferences5.getInt("redThreshold5", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor5();
        }



        synchronized (editor7) {
            boolean timerStarted7 = sharedPreferences7.getBoolean(TIMER_STARTED_KEY7, false);
            if (timerStarted7) {
                startTime7 = sharedPreferences7.getLong(START_TIME_KEY7, 0);
                timeInMilliseconds7 = sharedPreferences7.getLong(ELAPSED_TIME_KEY7, 0);
                sec7 = (int) (timeInMilliseconds7 / 1000);
                handler1.postDelayed(updateTimerThread7, 0);
            }
            people2_7 = sharedPreferences7.getBoolean("people_key7", false);
            flashing7 = sharedPreferences7.getBoolean("flashing_key7", false);
            flashingg7 = sharedPreferences7.getBoolean("flashingg_key7", false);
            isTimerRunning7 = sharedPreferences7.getBoolean("isTimerRunning7", false);
            currentHour7 = sharedPreferences7.getInt("currentHour7", currentHour7);
            currentMinute7 = sharedPreferences7.getInt("currentMinute7", currentMinute7);




            // 恢复加時時間
            blueThreshold7 = sharedPreferences7.getInt("blueThreshold7", originalblueThreshold2);
            yellowThreshold7 = sharedPreferences7.getInt("yellowThreshold7", originalyellowThreshold2);
            redThreshold7 = sharedPreferences7.getInt("redThreshold7", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor7();
        }

        synchronized (editor8) {
            boolean timerStarted8 = sharedPreferences8.getBoolean(TIMER_STARTED_KEY8, false);
            if (timerStarted8) {
                startTime8 = sharedPreferences8.getLong(START_TIME_KEY8, 0);
                timeInMilliseconds8 = sharedPreferences8.getLong(ELAPSED_TIME_KEY8, 0);
                sec8 = (int) (timeInMilliseconds8 / 1000);
                handler1.postDelayed(updateTimerThread8, 0);
            }
            people2_8 = sharedPreferences8.getBoolean("people_key8", false);
            flashing8 = sharedPreferences8.getBoolean("flashing_key8", false);
            flashingg8 = sharedPreferences8.getBoolean("flashingg_key8", false);
            isTimerRunning8 = sharedPreferences8.getBoolean("isTimerRunning8", false);
            currentHour8 = sharedPreferences8.getInt("currentHour8", currentHour8);
            currentMinute8 = sharedPreferences8.getInt("currentMinute8", currentMinute8);




            // 恢复加時時間
            blueThreshold8 = sharedPreferences8.getInt("blueThreshold8", originalblueThreshold2);
            yellowThreshold8 = sharedPreferences8.getInt("yellowThreshold8", originalyellowThreshold2);
            redThreshold8 = sharedPreferences8.getInt("redThreshold8", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor8();
        }

        synchronized (editor9) {
            boolean timerStarted9 = sharedPreferences9.getBoolean(TIMER_STARTED_KEY9, false);
            if (timerStarted9) {
                startTime9 = sharedPreferences9.getLong(START_TIME_KEY9, 0);
                timeInMilliseconds9 = sharedPreferences9.getLong(ELAPSED_TIME_KEY9, 0);
                sec9 = (int) (timeInMilliseconds9 / 1000);
                handler1.postDelayed(updateTimerThread9, 0);
            }
            people2_9 = sharedPreferences9.getBoolean("people_key9", false);
            flashing9 = sharedPreferences9.getBoolean("flashing_key9", false);
            flashingg9 = sharedPreferences9.getBoolean("flashingg_key9", false);
            isTimerRunning9 = sharedPreferences9.getBoolean("isTimerRunning9", false);
            currentHour9 = sharedPreferences9.getInt("currentHour9", currentHour9);
            currentMinute9 = sharedPreferences9.getInt("currentMinute9", currentMinute9);




            // 恢复加時時間
            blueThreshold9 = sharedPreferences9.getInt("blueThreshold9", originalblueThreshold2);
            yellowThreshold9 = sharedPreferences9.getInt("yellowThreshold9", originalyellowThreshold2);
            redThreshold9 = sharedPreferences9.getInt("redThreshold9", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor9();
        }

        synchronized (editor10) {
            boolean timerStarted10 = sharedPreferences10.getBoolean(TIMER_STARTED_KEY10, false);
            if (timerStarted10) {
                startTime10 = sharedPreferences10.getLong(START_TIME_KEY10, 0);
                timeInMilliseconds10 = sharedPreferences10.getLong(ELAPSED_TIME_KEY10, 0);
                sec10 = (int) (timeInMilliseconds10 / 1000);
                handler1.postDelayed(updateTimerThread10, 0);
            }
            people2_10 = sharedPreferences10.getBoolean("people_key10", false);
            flashing10 = sharedPreferences10.getBoolean("flashing_key10", false);
            flashingg10 = sharedPreferences10.getBoolean("flashingg_key10", false);
            isTimerRunning10 = sharedPreferences10.getBoolean("isTimerRunning10", false);
            currentHour10 = sharedPreferences10.getInt("currentHour10", currentHour10);
            currentMinute10 = sharedPreferences10.getInt("currentMinute10", currentMinute10);




            // 恢复加時時間
            blueThreshold10 = sharedPreferences10.getInt("blueThreshold10", originalblueThreshold2);
            yellowThreshold10 = sharedPreferences10.getInt("yellowThreshold10", originalyellowThreshold2);
            redThreshold10 = sharedPreferences10.getInt("redThreshold10", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor10();
        }

        synchronized (editor11) {
            boolean timerStarted11 = sharedPreferences11.getBoolean(TIMER_STARTED_KEY11, false);
            if (timerStarted11) {
                startTime11 = sharedPreferences11.getLong(START_TIME_KEY11, 0);
                timeInMilliseconds11 = sharedPreferences11.getLong(ELAPSED_TIME_KEY11, 0);
                sec11 = (int) (timeInMilliseconds11 / 1000);
                handler1.postDelayed(updateTimerThread11, 0);
            }
            people2_11 = sharedPreferences11.getBoolean("people_key11", false);
            flashing11 = sharedPreferences11.getBoolean("flashing_key11", false);
            flashingg11 = sharedPreferences11.getBoolean("flashingg_key11", false);
            isTimerRunning11 = sharedPreferences11.getBoolean("isTimerRunning11", false);
            currentHour11 = sharedPreferences11.getInt("currentHour11", currentHour11);
            currentMinute11 = sharedPreferences11.getInt("currentMinute11", currentMinute11);




            // 恢复加時時間
            blueThreshold11 = sharedPreferences11.getInt("blueThreshold11", originalblueThreshold2);
            yellowThreshold11 = sharedPreferences11.getInt("yellowThreshold11", originalyellowThreshold2);
            redThreshold11 = sharedPreferences11.getInt("redThreshold11", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor11();
        }

        synchronized (editor12) {
            boolean timerStarted12 = sharedPreferences12.getBoolean(TIMER_STARTED_KEY12, false);
            if (timerStarted12) {
                startTime201 = sharedPreferences12.getLong(START_TIME_KEY12, 0);
                timeInMilliseconds201 = sharedPreferences12.getLong(ELAPSED_TIME_KEY12, 0);
                sec201 = (int) (timeInMilliseconds201 / 1000);
                handler1.postDelayed(updateTimerThread201, 0);
            }
            people2_12 = sharedPreferences12.getBoolean("people_key12", false);
            flashing201 = sharedPreferences12.getBoolean("flashing_key12", false);
            flashingg201 = sharedPreferences12.getBoolean("flashingg_key12", false);
            isTimerRunning201 = sharedPreferences12.getBoolean("isTimerRunning12", false);
            currentHour12 = sharedPreferences12.getInt("currentHour12", currentHour12);
            currentMinute12 = sharedPreferences12.getInt("currentMinute12", currentMinute12);




            // 恢复加時時間
            blueThreshold201 = sharedPreferences12.getInt("blueThreshold12", originalblueThreshold3);
            yellowThreshold201 = sharedPreferences12.getInt("yellowThreshold12", originalyellowThreshold3);
            redThreshold201 = sharedPreferences12.getInt("redThreshold12", originalredThreshold3);

            // 更新按鈕的背景顏色
            updateButtonColor201();
        }

        synchronized (editor13) {
            boolean timerStarted13 = sharedPreferences13.getBoolean(TIMER_STARTED_KEY13, false);
            if (timerStarted13) {
                startTime202 = sharedPreferences13.getLong(START_TIME_KEY13, 0);
                timeInMilliseconds202 = sharedPreferences13.getLong(ELAPSED_TIME_KEY13, 0);
                sec202 = (int) (timeInMilliseconds202 / 1000);
                handler1.postDelayed(updateTimerThread202, 0);
            }
            people2_13 = sharedPreferences13.getBoolean("people_key13", false);
            flashing202 = sharedPreferences13.getBoolean("flashing_key13", false);
            flashingg202 = sharedPreferences13.getBoolean("flashingg_key13", false);
            isTimerRunning202 = sharedPreferences13.getBoolean("isTimerRunning13", false);
            currentHour13 = sharedPreferences13.getInt("currentHour13", currentHour13);
            currentMinute13 = sharedPreferences13.getInt("currentMinute13", currentMinute13);




            // 恢复加時時間
            blueThreshold202 = sharedPreferences13.getInt("blueThreshold13", originalblueThreshold3);
            yellowThreshold202 = sharedPreferences13.getInt("yellowThreshold13", originalyellowThreshold3);
            redThreshold202 = sharedPreferences13.getInt("redThreshold13", originalredThreshold3);

            // 更新按鈕的背景顏色
            updateButtonColor202();
        }

        synchronized (editor14) {
            boolean timerStarted14 = sharedPreferences14.getBoolean(TIMER_STARTED_KEY14, false);
            if (timerStarted14) {
                startTime203 = sharedPreferences14.getLong(START_TIME_KEY14, 0);
                timeInMilliseconds203 = sharedPreferences14.getLong(ELAPSED_TIME_KEY14, 0);
                sec203 = (int) (timeInMilliseconds203 / 1000);
                handler1.postDelayed(updateTimerThread203, 0);
            }
            people2_14 = sharedPreferences14.getBoolean("people_key14", false);
            flashing203 = sharedPreferences14.getBoolean("flashing_key14", false);
            flashingg203 = sharedPreferences14.getBoolean("flashingg_key14", false);
            isTimerRunning203 = sharedPreferences14.getBoolean("isTimerRunning14", false);
            currentHour14 = sharedPreferences14.getInt("currentHour14", currentHour14);
            currentMinute14 = sharedPreferences14.getInt("currentMinute14", currentMinute14);




            // 恢复加時時間
            blueThreshold203 = sharedPreferences14.getInt("blueThreshold14", originalblueThreshold3);
            yellowThreshold203 = sharedPreferences14.getInt("yellowThreshold14", originalyellowThreshold3);
            redThreshold203 = sharedPreferences14.getInt("redThreshold14", originalredThreshold3);

            // 更新按鈕的背景顏色
            updateButtonColor203();
        }

        synchronized (editor15) {
            boolean timerStarted15 = sharedPreferences15.getBoolean(TIMER_STARTED_KEY15, false);
            if (timerStarted15) {
                startTime204 = sharedPreferences15.getLong(START_TIME_KEY15, 0);
                timeInMilliseconds204 = sharedPreferences15.getLong(ELAPSED_TIME_KEY15, 0);
                sec204 = (int) (timeInMilliseconds204 / 1000);
                handler1.postDelayed(updateTimerThread204, 0);
            }
            people2_15 = sharedPreferences15.getBoolean("people_key15", false);
            flashing204 = sharedPreferences15.getBoolean("flashing_key15", false);
            flashingg204 = sharedPreferences15.getBoolean("flashingg_key15", false);
            isTimerRunning204 = sharedPreferences15.getBoolean("isTimerRunning15", false);
            currentHour15 = sharedPreferences15.getInt("currentHour15", currentHour15);
            currentMinute15 = sharedPreferences15.getInt("currentMinute15", currentMinute15);





            // 恢复加時時間
            blueThreshold204 = sharedPreferences15.getInt("blueThreshold15", originalblueThreshold3);
            yellowThreshold204 = sharedPreferences15.getInt("yellowThreshold15", originalyellowThreshold3);
            redThreshold204 = sharedPreferences15.getInt("redThreshold15", originalredThreshold3);

            // 更新按鈕的背景顏色
            updateButtonColor204();
        }

        synchronized (editor16) {
            boolean timerStarted16 = sharedPreferences16.getBoolean(TIMER_STARTED_KEY16, false);
            if (timerStarted16) {
                startTime16 = sharedPreferences16.getLong(START_TIME_KEY16, 0);
                timeInMilliseconds16 = sharedPreferences16.getLong(ELAPSED_TIME_KEY16, 0);
                sec16 = (int) (timeInMilliseconds16 / 1000);
                handler1.postDelayed(updateTimerThread16, 0);
            }
            people2_16 = sharedPreferences16.getBoolean("people_key16", false);
            flashing16 = sharedPreferences16.getBoolean("flashing_key16", false);
            flashingg16 = sharedPreferences16.getBoolean("flashingg_key16", false);
            isTimerRunning16 = sharedPreferences16.getBoolean("isTimerRunning16", false);
            currentHour16 = sharedPreferences16.getInt("currentHour16", currentHour16);
            currentMinute16 = sharedPreferences16.getInt("currentMinute16", currentMinute16);




            // 恢复加時時間
            blueThreshold16 = sharedPreferences16.getInt("blueThreshold16", originalblueThreshold2);
            yellowThreshold16 = sharedPreferences16.getInt("yellowThreshold16", originalyellowThreshold2);
            redThreshold16 = sharedPreferences16.getInt("redThreshold16", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor16();
        }

        synchronized (editor17) {
            boolean timerStarted17 = sharedPreferences17.getBoolean(TIMER_STARTED_KEY17, false);
            if (timerStarted17) {
                startTime17 = sharedPreferences17.getLong(START_TIME_KEY17, 0);
                timeInMilliseconds17 = sharedPreferences17.getLong(ELAPSED_TIME_KEY17, 0);
                sec17 = (int) (timeInMilliseconds17 / 1000);
                handler1.postDelayed(updateTimerThread17, 0);
            }
            people2_17 = sharedPreferences17.getBoolean("people_key17", false);
            flashing17 = sharedPreferences17.getBoolean("flashing_key17", false);
            flashingg17 = sharedPreferences17.getBoolean("flashingg_key17", false);
            isTimerRunning17 = sharedPreferences17.getBoolean("isTimerRunning17", false);
            currentHour17 = sharedPreferences17.getInt("currentHour17", currentHour17);
            currentMinute17 = sharedPreferences17.getInt("currentMinute17", currentMinute17);




            // 恢复加時時間
            blueThreshold17 = sharedPreferences17.getInt("blueThreshold17", originalblueThreshold2);
            yellowThreshold17 = sharedPreferences17.getInt("yellowThreshold17", originalyellowThreshold2);
            redThreshold17 = sharedPreferences17.getInt("redThreshold17", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor17();
        }

        synchronized (editor18) {
            boolean timerStarted18 = sharedPreferences18.getBoolean(TIMER_STARTED_KEY18, false);
            if (timerStarted18) {
                startTime18 = sharedPreferences18.getLong(START_TIME_KEY18, 0);
                timeInMilliseconds18 = sharedPreferences18.getLong(ELAPSED_TIME_KEY18, 0);
                sec18 = (int) (timeInMilliseconds18 / 1000);
                handler1.postDelayed(updateTimerThread18, 0);
            }
            people2_18 = sharedPreferences18.getBoolean("people_key18", false);
            flashing18 = sharedPreferences18.getBoolean("flashing_key18", false);
            flashingg18 = sharedPreferences18.getBoolean("flashingg_key18", false);
            isTimerRunning18 = sharedPreferences18.getBoolean("isTimerRunning18", false);
            currentHour18 = sharedPreferences18.getInt("currentHour18", currentHour18);
            currentMinute18 = sharedPreferences18.getInt("currentMinute18", currentMinute18);




            // 恢复加時時間
            blueThreshold18 = sharedPreferences18.getInt("blueThreshold18", originalblueThreshold2);
            yellowThreshold18 = sharedPreferences18.getInt("yellowThreshold18", originalyellowThreshold2);
            redThreshold18 = sharedPreferences18.getInt("redThreshold18", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor18();
        }

        synchronized (editor19) {
            boolean timerStarted19 = sharedPreferences19.getBoolean(TIMER_STARTED_KEY19, false);
            if (timerStarted19) {
                startTime19 = sharedPreferences19.getLong(START_TIME_KEY19, 0);
                timeInMilliseconds19 = sharedPreferences19.getLong(ELAPSED_TIME_KEY19, 0);
                sec19 = (int) (timeInMilliseconds19 / 1000);
                handler1.postDelayed(updateTimerThread19, 0);
            }
            people2_19 = sharedPreferences19.getBoolean("people_key19", false);
            flashing19 = sharedPreferences19.getBoolean("flashing_key19", false);
            flashingg19 = sharedPreferences19.getBoolean("flashingg_key19", false);
            isTimerRunning19 = sharedPreferences19.getBoolean("isTimerRunning19", false);
            currentHour19 = sharedPreferences19.getInt("currentHour19", currentHour19);
            currentMinute19 = sharedPreferences19.getInt("currentMinute19", currentMinute19);




            // 恢复加時時間
            blueThreshold19 = sharedPreferences19.getInt("blueThreshold19", originalblueThreshold2);
            yellowThreshold19 = sharedPreferences19.getInt("yellowThreshold19", originalyellowThreshold2);
            redThreshold19 = sharedPreferences19.getInt("redThreshold19", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor19();
        }

        synchronized (editor20) {
            boolean timerStarted20 = sharedPreferences20.getBoolean(TIMER_STARTED_KEY20, false);
            if (timerStarted20) {
                startTime20 = sharedPreferences20.getLong(START_TIME_KEY20, 0);
                timeInMilliseconds20 = sharedPreferences20.getLong(ELAPSED_TIME_KEY20, 0);
                sec20 = (int) (timeInMilliseconds20 / 1000);
                handler1.postDelayed(updateTimerThread20, 0);
            }
            people2_20 = sharedPreferences20.getBoolean("people_key20", false);
            flashing20 = sharedPreferences20.getBoolean("flashing_key20", false);
            flashingg20 = sharedPreferences20.getBoolean("flashingg_key20", false);
            isTimerRunning20 = sharedPreferences20.getBoolean("isTimerRunning20", false);
            currentHour20 = sharedPreferences20.getInt("currentHour20", currentHour20);
            currentMinute20 = sharedPreferences20.getInt("currentMinute20", currentMinute20);
            currentHour20 = sharedPreferences20.getInt("currentHour20", currentHour20);
            currentMinute20 = sharedPreferences20.getInt("currentMinute20", currentMinute20);




            // 恢复加時時間
            blueThreshold20 = sharedPreferences20.getInt("blueThreshold20", originalblueThreshold2);
            yellowThreshold20 = sharedPreferences20.getInt("yellowThreshold20", originalyellowThreshold2);
            redThreshold20 = sharedPreferences20.getInt("redThreshold20", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor20();
        }

        synchronized (editor21) {
            boolean timerStarted21 = sharedPreferences21.getBoolean(TIMER_STARTED_KEY21, false);
            if (timerStarted21) {
                startTime21 = sharedPreferences21.getLong(START_TIME_KEY21, 0);
                timeInMilliseconds21 = sharedPreferences21.getLong(ELAPSED_TIME_KEY21, 0);
                sec21 = (int) (timeInMilliseconds21 / 1000);
                handler1.postDelayed(updateTimerThread21, 0);
            }
            people2_21 = sharedPreferences21.getBoolean("people_key21", false);
            flashing21 = sharedPreferences21.getBoolean("flashing_key21", false);
            flashingg21 = sharedPreferences21.getBoolean("flashingg_key21", false);
            isTimerRunning21 = sharedPreferences21.getBoolean("isTimerRunning21", false);
            currentHour21 = sharedPreferences21.getInt("currentHour21", currentHour21);
            currentMinute21 = sharedPreferences21.getInt("currentMinute21", currentMinute21);




            // 恢复加時時間
            blueThreshold21 = sharedPreferences21.getInt("blueThreshold21", originalblueThreshold2);
            yellowThreshold21 = sharedPreferences21.getInt("yellowThreshold21", originalyellowThreshold2);
            redThreshold21 = sharedPreferences21.getInt("redThreshold21", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor21();
        }

        synchronized (editor22) {
            boolean timerStarted22 = sharedPreferences22.getBoolean(TIMER_STARTED_KEY22, false);
            if (timerStarted22) {
                startTime22 = sharedPreferences22.getLong(START_TIME_KEY22, 0);
                timeInMilliseconds22 = sharedPreferences22.getLong(ELAPSED_TIME_KEY22, 0);
                sec22 = (int) (timeInMilliseconds22 / 1000);
                handler1.postDelayed(updateTimerThread22, 0);
            }
            people2_22 = sharedPreferences22.getBoolean("people_key22", false);
            flashing22 = sharedPreferences22.getBoolean("flashing_key22", false);
            flashingg22 = sharedPreferences22.getBoolean("flashingg_key22", false);
            isTimerRunning22 = sharedPreferences22.getBoolean("isTimerRunning22", false);
            currentHour22 = sharedPreferences22.getInt("currentHour22", currentHour22);
            currentMinute22 = sharedPreferences22.getInt("currentMinute22", currentMinute22);




            // 恢复加時時間
            blueThreshold22 = sharedPreferences22.getInt("blueThreshold22", originalblueThreshold2);
            yellowThreshold22 = sharedPreferences22.getInt("yellowThreshold22", originalyellowThreshold2);
            redThreshold22 = sharedPreferences22.getInt("redThreshold22", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor22();
        }

        synchronized (editor23) {
            boolean timerStarted23 = sharedPreferences23.getBoolean(TIMER_STARTED_KEY23, false);
            if (timerStarted23) {
                startTime23 = sharedPreferences23.getLong(START_TIME_KEY23, 0);
                timeInMilliseconds23 = sharedPreferences23.getLong(ELAPSED_TIME_KEY23, 0);
                sec23 = (int) (timeInMilliseconds23 / 1000);
                handler1.postDelayed(updateTimerThread23, 0);
            }
            people2_23 = sharedPreferences23.getBoolean("people_key23", false);
            flashing23 = sharedPreferences23.getBoolean("flashing_key23", false);
            flashingg23 = sharedPreferences23.getBoolean("flashingg_key23", false);
            isTimerRunning23 = sharedPreferences23.getBoolean("isTimerRunning23", false);
            currentHour23 = sharedPreferences23.getInt("currentHour23", currentHour23);
            currentMinute23 = sharedPreferences23.getInt("currentMinute23", currentMinute23);




            // 恢复加時時間
            blueThreshold23 = sharedPreferences23.getInt("blueThreshold23", originalblueThreshold2);
            yellowThreshold23 = sharedPreferences23.getInt("yellowThreshold23", originalyellowThreshold2);
            redThreshold23 = sharedPreferences23.getInt("redThreshold23", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor23();
        }

        synchronized (editor24) {
            boolean timerStarted24 = sharedPreferences24.getBoolean(TIMER_STARTED_KEY24, false);
            if (timerStarted24) {
                startTime24 = sharedPreferences24.getLong(START_TIME_KEY24, 0);
                timeInMilliseconds24 = sharedPreferences24.getLong(ELAPSED_TIME_KEY24, 0);
                sec24 = (int) (timeInMilliseconds24 / 1000);
                handler1.postDelayed(updateTimerThread24, 0);
            }
            people2_24 = sharedPreferences24.getBoolean("people_key24", false);
            flashing24 = sharedPreferences24.getBoolean("flashing_key24", false);
            flashingg24 = sharedPreferences24.getBoolean("flashingg_key24", false);
            isTimerRunning24 = sharedPreferences24.getBoolean("isTimerRunning24", false);
            currentHour24 = sharedPreferences24.getInt("currentHour24", currentHour24);
            currentMinute24 = sharedPreferences24.getInt("currentMinute24", currentMinute24);




            // 恢复加時時間
            blueThreshold24 = sharedPreferences24.getInt("blueThreshold24", originalblueThreshold2);
            yellowThreshold24 = sharedPreferences24.getInt("yellowThreshold24", originalyellowThreshold2);
            redThreshold24 = sharedPreferences24.getInt("redThreshold24", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor24();
        }

        synchronized (editor25) {
            boolean timerStarted25 = sharedPreferences25.getBoolean(TIMER_STARTED_KEY25, false);
            if (timerStarted25) {
                startTime25 = sharedPreferences25.getLong(START_TIME_KEY25, 0);
                timeInMilliseconds25 = sharedPreferences25.getLong(ELAPSED_TIME_KEY25, 0);
                sec25 = (int) (timeInMilliseconds25 / 1000);
                handler1.postDelayed(updateTimerThread25, 0);
            }
            people2_25 = sharedPreferences25.getBoolean("people_key25", false);
            flashing25 = sharedPreferences25.getBoolean("flashing_key25", false);
            flashingg25 = sharedPreferences25.getBoolean("flashingg_key25", false);
            isTimerRunning25 = sharedPreferences25.getBoolean("isTimerRunning25", false);
            currentHour25 = sharedPreferences25.getInt("currentHour25", currentHour25);
            currentMinute25 = sharedPreferences25.getInt("currentMinute25", currentMinute25);


            // 恢复加時時間
            blueThreshold25 = sharedPreferences25.getInt("blueThreshold25", originalblueThreshold2);
            yellowThreshold25 = sharedPreferences25.getInt("yellowThreshold25", originalyellowThreshold2);
            redThreshold25 = sharedPreferences25.getInt("redThreshold25", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor25();
        }

        synchronized (editor27RR) {
            boolean timerStarted27RR = sharedPreferences27RR.getBoolean(TIMER_STARTED_KEY27RR, false);
            if (timerStarted27RR) {
                startTime27RR = sharedPreferences27RR.getLong(START_TIME_KEY27RR, 0);
                timeInMilliseconds27RR = sharedPreferences27RR.getLong(ELAPSED_TIME_KEY27RR, 0);
                sec27RR = (int) (timeInMilliseconds27RR / 1000);
                handler1.postDelayed(updateTimerThread27RR, 0);
            }
            people2_27RR = sharedPreferences27RR.getBoolean("people_key27RR", false);
            flashing27RR = sharedPreferences27RR.getBoolean("flashing_key27RR", false);
            flashingg27RR = sharedPreferences27RR.getBoolean("flashingg_key27RR", false);
            isTimerRunning27RR = sharedPreferences27RR.getBoolean("isTimerRunning27RR", false);
            currentHour27RR = sharedPreferences27RR.getInt("currentHour27RR", currentHour27RR);
            currentMinute27RR = sharedPreferences27RR.getInt("currentMinute27RR", currentMinute27RR);


            // 恢复加時時間
            blueThreshold27RR = sharedPreferences27RR.getInt("blueThreshold27RR", originalblueThreshold2);
            yellowThreshold27RR = sharedPreferences27RR.getInt("yellowThreshold27RR", originalyellowThreshold2);
            redThreshold27RR = sharedPreferences27RR.getInt("redThreshold27RR", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor27RR();
        }

        synchronized (editor28RR) {
            boolean timerStarted28RR = sharedPreferences28RR.getBoolean(TIMER_STARTED_KEY28RR, false);
            if (timerStarted28RR) {
                startTime28RR = sharedPreferences28RR.getLong(START_TIME_KEY28RR, 0);
                timeInMilliseconds28RR = sharedPreferences28RR.getLong(ELAPSED_TIME_KEY28RR, 0);
                sec28RR = (int) (timeInMilliseconds28RR / 1000);
                handler1.postDelayed(updateTimerThread28RR, 0);
            }
            people2_28RR = sharedPreferences28RR.getBoolean("people_key28RR", false);
            flashing28RR = sharedPreferences28RR.getBoolean("flashing_key28RR", false);
            flashingg28RR = sharedPreferences28RR.getBoolean("flashingg_key28RR", false);
            isTimerRunning28RR = sharedPreferences28RR.getBoolean("isTimerRunning28RR", false);
            currentHour28RR = sharedPreferences28RR.getInt("currentHour28RR", currentHour28RR);
            currentMinute28RR = sharedPreferences28RR.getInt("currentMinute28RR", currentMinute28RR);




            // 恢复加時時間
            blueThreshold28RR = sharedPreferences28RR.getInt("blueThreshold28RR", originalblueThreshold2);
            yellowThreshold28RR = sharedPreferences28RR.getInt("yellowThreshold28RR", originalyellowThreshold2);
            redThreshold28RR = sharedPreferences28RR.getInt("redThreshold28RR", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor28RR();

        }
        synchronized (editor66) {
            boolean timerStarted66 = sharedPreferences66.getBoolean(TIMER_STARTED_KEY66, false);
            if (timerStarted66) {
                startTime66 = sharedPreferences66.getLong(START_TIME_KEY66, 0);
                timeInMilliseconds66 = sharedPreferences66.getLong(ELAPSED_TIME_KEY66, 0);
                sec66 = (int) (timeInMilliseconds66 / 1000);
                handler1.postDelayed(updateTimerThread66, 0);
            }
            people2_66 = sharedPreferences66.getBoolean("people_key66", false);
            flashing66 = sharedPreferences66.getBoolean("flashing_key66", false);
            flashingg66 = sharedPreferences66.getBoolean("flashingg_key66", false);
            isTimerRunning66 = sharedPreferences66.getBoolean("isTimerRunning66", false);
            currentHour66 = sharedPreferences66.getInt("currentHour66", currentHour66);
            currentMinute66 = sharedPreferences66.getInt("currentMinute66", currentMinute66);




            // 恢复加時時間
            blueThreshold66 = sharedPreferences66.getInt("blueThreshold66", originalblueThreshold2);
            yellowThreshold66 = sharedPreferences66.getInt("yellowThreshold66", originalyellowThreshold2);
            redThreshold66 = sharedPreferences66.getInt("redThreshold66", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor66();

        }

        synchronized (editor26RR) {
            boolean timerStarted26RR = sharedPreferences26RR.getBoolean(TIMER_STARTED_KEY26RR, false);
            if (timerStarted26RR) {
                startTime26RR = sharedPreferences26RR.getLong(START_TIME_KEY26RR, 0);
                timeInMilliseconds26RR = sharedPreferences26RR.getLong(ELAPSED_TIME_KEY26RR, 0);
                sec26RR = (int) (timeInMilliseconds26RR / 1000);
                handler1.postDelayed(updateTimerThread26RR, 0);
            }
            people2_26RR = sharedPreferences26RR.getBoolean("people_key26RR", false);
            flashing26RR = sharedPreferences26RR.getBoolean("flashing_key26RR", false);
            flashingg26RR = sharedPreferences26RR.getBoolean("flashingg_key26RR", false);
            isTimerRunning26RR = sharedPreferences26RR.getBoolean("isTimerRunning26RR", false);
            currentHour26RR = sharedPreferences26RR.getInt("currentHour26RR", currentHour26RR);
            currentMinute26RR = sharedPreferences26RR.getInt("currentMinute26RR", currentMinute26RR);




            // 恢复加時時間
            blueThreshold26RR = sharedPreferences26RR.getInt("blueThreshold26RR", originalblueThreshold2);
            yellowThreshold26RR = sharedPreferences26RR.getInt("yellowThreshold26RR", originalyellowThreshold2);
            redThreshold26RR = sharedPreferences26RR.getInt("redThreshold26RR", originalredThreshold2);

            // 更新按鈕的背景顏色
            updateButtonColor26RR();
        }


    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    private void stopTimer1() {
        handler1.removeCallbacks(updateTimerThread1);
    }
    private void stopTimer2() {
        handler1.removeCallbacks(updateTimerThread2);
    }
    private void stopTimer3() {
        handler1.removeCallbacks(updateTimerThread3);
    }
    private void stopTimer4() {
        handler1.removeCallbacks(updateTimerThread4);
    }
    private void stopTimer5() {
        handler1.removeCallbacks(updateTimerThread5);
    }

    private void stopTimer7() {
        handler1.removeCallbacks(updateTimerThread7);
    }
    private void stopTimer8() {
        handler1.removeCallbacks(updateTimerThread8);
    }
    private void stopTimer9() {
        handler1.removeCallbacks(updateTimerThread9);
    }
    private void stopTimer10() {
        handler1.removeCallbacks(updateTimerThread10);
    }
    private void stopTimer11() {
        handler1.removeCallbacks(updateTimerThread11);
    }
    private void stopTimer16() {
        handler1.removeCallbacks(updateTimerThread16);
    }
    private void stopTimer17() {
        handler1.removeCallbacks(updateTimerThread17);
    }
    private void stopTimer18() {
        handler1.removeCallbacks(updateTimerThread18);
    }
    private void stopTimer19() {
        handler1.removeCallbacks(updateTimerThread19);
    }
    private void stopTimer20() {
        handler1.removeCallbacks(updateTimerThread20);
    }
    private void stopTimer21() {
        handler1.removeCallbacks(updateTimerThread21);
    }
    private void stopTimer22() {
        handler1.removeCallbacks(updateTimerThread22);
    }
    private void stopTimer23() {
        handler1.removeCallbacks(updateTimerThread23);
    }
    private void stopTimer24() {
        handler1.removeCallbacks(updateTimerThread24);
    }
    private void stopTimer25() {
        handler1.removeCallbacks(updateTimerThread25);
    }
    /*private void stopTimer266() {
        handler1.removeCallbacks(updateTimerThread266);
    }*/
    private void stopTimer27RR() {
        handler1.removeCallbacks(updateTimerThread27RR);
    }
    private void stopTimer28RR() {
        handler1.removeCallbacks(updateTimerThread28RR);
    }
    private void stopTimer201() {
        handler1.removeCallbacks(updateTimerThread201);
    }
    private void stopTimer202() {
        handler1.removeCallbacks(updateTimerThread202);
    }
    private void stopTimer203() {
        handler1.removeCallbacks(updateTimerThread203);
    }
    private void stopTimer204() {
        handler1.removeCallbacks(updateTimerThread204);
    }
    private void stopTimer66() {
        handler1.removeCallbacks(updateTimerThread66);
    }

    private void stopTimer26RR() {
        handler1.removeCallbacks(updateTimerThread26RR);
    }


    private void resetseconds1() {
        seconds1 = 0;
        sec1 = 0;
        minutes1 = 0;
        hours1 = 0;
        String timeString = String.format("%02d:%02d", hours1, minutes1);
        btnTimer1.setText(timeString);
    }
    private void resetseconds2() {
        seconds2 = 0;
        sec2 = 0;
        minutes2 = 0;
        hours2 = 0;
        String timeString = String.format("%02d:%02d", hours2, minutes2);
        btnTimer2.setText(timeString);
    }

    private void resetseconds3() {
        seconds3 = 0;
        sec3 = 0;
        minutes3 = 0;
        hours3 = 0;
        String timeString = String.format("%02d:%02d", hours3, minutes3);
        btnTimer3.setText(timeString);
    }

    private void resetseconds4() {
        seconds4 = 0;
        sec4 = 0;
        minutes4 = 0;
        hours4 = 0;
        String timeString = String.format("%02d:%02d", hours4, minutes4);
        btnTimer4.setText(timeString);
    }
    private void resetseconds5() {
        seconds5 = 0;
        sec5 = 0;
        minutes5 = 0;
        hours5 = 0;
        String timeString = String.format("%02d:%02d", hours5, minutes5);
        btnTimer5.setText(timeString);
    }

    private void resetseconds6() {
        seconds6 = 0;
        sec6 = 0;
        minutes6 = 0;
        hours6 = 0;
        String timeString = String.format("%02d:%02d", hours6, minutes6);
        btnTimer6.setText(timeString);
    }

    private void resetseconds7() {
        seconds7 = 0;
        sec7 = 0;
        minutes7 = 0;
        hours7 = 0;
        String timeString = String.format("%02d:%02d", hours7, minutes7);
        btnTimer7.setText(timeString);
    }

    private void resetseconds8() {
        seconds8 = 0;
        sec8 = 0;
        minutes8 = 0;
        hours8 = 0;
        String timeString = String.format("%02d:%02d", hours8, minutes8);
        btnTimer8.setText(timeString);
    }

    private void resetseconds9() {
        seconds9 = 0;
        sec9 = 0;
        minutes9 = 0;
        hours9 = 0;
        String timeString = String.format("%02d:%02d", hours9, minutes9);
        btnTimer9.setText(timeString);
    }

    private void resetseconds10() {
        seconds10 = 0;
        sec10 = 0;
        minutes10 = 0;
        hours10 = 0;
        String timeString = String.format("%02d:%02d", hours10, minutes10);
        btnTimer10.setText(timeString);
    }

    private void resetseconds11() {
        seconds11 = 0;
        sec11 = 0;
        minutes11 = 0;
        hours11 = 0;
        String timeString = String.format("%02d:%02d", hours11, minutes11);
        btnTimer11.setText(timeString);
    }

    private void resetseconds16() {
        seconds16 = 0;
        sec16 = 0;
        minutes16 = 0;
        hours16 = 0;
        String timeString = String.format("%02d:%02d", hours16, minutes16);
        btnTimer16.setText(timeString);
    }

    private void resetseconds17() {
        seconds17 = 0;
        sec17 = 0;
        minutes17 = 0;
        hours17 = 0;
        String timeString = String.format("%02d:%02d", hours17, minutes17);
        btnTimer17.setText(timeString);
    }

    private void resetseconds18() {
        seconds18 = 0;
        sec18 = 0;
        minutes18 = 0;
        hours18 = 0;
        String timeString = String.format("%02d:%02d", hours18, minutes18);
        btnTimer18.setText(timeString);
    }

    private void resetseconds19() {
        seconds19 = 0;
        sec19 = 0;
        minutes19 = 0;
        hours19 = 0;
        String timeString = String.format("%02d:%02d", hours19, minutes19);
        btnTimer19.setText(timeString);
    }

    private void resetseconds20() {
        seconds20 = 0;
        sec20 = 0;
        minutes20 = 0;
        hours20 = 0;
        String timeString = String.format("%02d:%02d", hours20, minutes20);
        btnTimer20.setText(timeString);
    }

    private void resetseconds21() {
        seconds21 = 0;
        sec21 = 0;
        minutes21 = 0;
        hours21 = 0;
        String timeString = String.format("%02d:%02d", hours21, minutes21);
        btnTimer21.setText(timeString);
    }

    private void resetseconds22() {
        seconds22 = 0;
        sec22 = 0;
        minutes22 = 0;
        hours22 = 0;
        String timeString = String.format("%02d:%02d", hours22, minutes22);
        btnTimer22.setText(timeString);
    }

    private void resetseconds23() {
        seconds23 = 0;
        sec23 = 0;
        minutes23 = 0;
        hours23 = 0;
        String timeString = String.format("%02d:%02d", hours23, minutes23);
        btnTimer23.setText(timeString);
    }

    private void resetseconds24() {
        seconds24 = 0;
        sec24 = 0;
        minutes24 = 0;
        hours24 = 0;
        String timeString = String.format("%02d:%02d", hours24, minutes24);
        btnTimer24.setText(timeString);
    }

    private void resetseconds25() {
        seconds25 = 0;
        sec25 = 0;
        minutes25 = 0;
        hours25 = 0;
        String timeString = String.format("%02d:%02d", hours25, minutes25);
        btnTimer25.setText(timeString);
    }
/*
    private void resetseconds266() {
        seconds266 = 0;
        sec266 = 0;
        minutes266 = 0;
        hours266 = 0;
        String timeString = String.format("%02d:%02d", hours266, minutes266);
        btnTimer266.setText(timeString);
    }
*/
    private void resetseconds27RR() {
        seconds27RR = 0;
        sec27RR = 0;
        minutes27RR = 0;
        hours27RR = 0;
        String timeString = String.format("%02d:%02d",  hours27RR, minutes27RR);
        btnTimer27RR.setText(timeString);
    }

    private void resetseconds28RR() {
        seconds28RR = 0;
        sec28RR = 0;
        minutes28RR = 0;
        hours28RR = 0;
        String timeString = String.format("%02d:%02d",  hours28RR, minutes28RR);
        btnTimer28RR.setText(timeString);
    }
    private void resetseconds66() {
        seconds66 = 0;
        sec66 = 0;
        minutes66 = 0;
        hours66 = 0;
        String timeString = String.format("%02d:%02d",  hours66, minutes66);
        btnTimer66.setText(timeString);
    }

    private void resetseconds201() {
        seconds201 = 0;
        sec201 = 0;
        minutes201 = 0;
        hours201 = 0;
        String timeString = String.format("%02d:%02d", hours201, minutes201);
        btnTimer201.setText(timeString);
    }

    private void resetseconds202() {
        seconds202 = 0;
        sec202 = 0;
        minutes202 = 0;
        hours202 = 0;
        String timeString = String.format("%02d:%02d", hours202, minutes202);
        btnTimer202.setText(timeString);
    }

    private void resetseconds203() {
        seconds203 = 0;
        sec203 = 0;
        minutes203 = 0;
        hours203 = 0;
        String timeString = String.format("%02d:%02d", hours203, minutes203);
        btnTimer203.setText(timeString);
    }

    private void resetseconds204() {
        seconds204 = 0;
        sec204 = 0;
        minutes204 = 0;
        hours204 = 0;
        String timeString = String.format("%02d:%02d", hours204, minutes204);
        btnTimer204.setText(timeString);
    }

    private void resetseconds26RR() {
        seconds26RR = 0;
        sec26RR = 0;
        minutes26RR = 0;
        hours26RR = 0;
        String timeString = String.format("%02d:%02d", hours26RR, minutes26RR);
        btnTimer26RR.setText(timeString);
    }


    private void resetButtonColor1() {
        btnTimer1.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor2() {
        btnTimer2.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor3() {
        btnTimer3.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor4() {
        btnTimer4.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor5() {
        btnTimer5.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor6() {
        btnTimer6.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor7() {
        btnTimer7.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor8() {
        btnTimer8.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor9() {
        btnTimer9.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor10() {
        btnTimer10.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor11() {
        btnTimer11.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor16() {
        btnTimer16.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor17() {
        btnTimer17.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor18() {
        btnTimer18.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor19() {
        btnTimer19.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor20() {
        btnTimer20.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor21() {
        btnTimer21.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor22() {
        btnTimer22.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor23() {
        btnTimer23.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor24() {
        btnTimer24.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor25() {
        btnTimer25.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor266() {
        btnTimer266.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor27RR() {
        btnTimer27RR.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor28RR() {
        btnTimer28RR.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor66() {
        btnTimer66.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor201() {
        btnTimer201.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor202() {
        btnTimer202.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor203() {
        btnTimer203.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor204() {
        btnTimer204.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor26RR() {
        btnTimer26RR.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void showConfirmationDialogYNForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer1();
                resetThresholdsToOriginal1();
                resetseconds1();
                resetButtonColor1();
                btnTimer1.clearAnimation();
                flashing1 = false;
                flashingg1 = false;
                isTimerRunning1 = false;
                dialog.dismiss();

            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2();
                resetThresholdsToOriginal2();
                resetseconds2();
                resetButtonColor2();
                btnTimer2.clearAnimation();
                flashing2 = false;flashingg2 = false;
                isTimerRunning2 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer3();
                resetThresholdsToOriginal3();
                resetseconds3();
                resetButtonColor3();
                btnTimer3.clearAnimation();
                flashing3 = false;flashingg3 = false;
                isTimerRunning3 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer4();
                resetThresholdsToOriginal4();
                resetseconds4();
                resetButtonColor4();
                btnTimer4.clearAnimation();
                flashing4 = false;flashingg4 = false;
                isTimerRunning4 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer5();
                resetThresholdsToOriginal5();
                resetseconds5();
                resetButtonColor5();
                btnTimer5.clearAnimation();
                flashing5 = false;flashingg5 = false;
                isTimerRunning5 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }


    private void showConfirmationDialogYNForButton7() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer7();
                resetThresholdsToOriginal7();
                resetseconds7();
                resetButtonColor7();
                btnTimer7.clearAnimation();
                flashing7 = false;flashingg7 = false;
                isTimerRunning7 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton8() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer8();
                resetThresholdsToOriginal8();
                resetseconds8();
                resetButtonColor8();
                btnTimer8.clearAnimation();
                flashing8 = false;flashingg8 = false;
                isTimerRunning8 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton9() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer9();
                resetThresholdsToOriginal9();
                resetseconds9();
                resetButtonColor9();
                btnTimer9.clearAnimation();
                flashing9 = false;flashingg9 = false;
                isTimerRunning9 = false;



                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton10() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer10();
                resetThresholdsToOriginal10();
                resetseconds10();
                resetButtonColor10();
                btnTimer10.clearAnimation();
                flashing10 = false;flashingg10 = false;
                isTimerRunning10 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton11() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer11();
                resetThresholdsToOriginal11();
                resetseconds11();
                resetButtonColor11();
                btnTimer11.clearAnimation();
                flashing11 = false;flashingg11 = false;
                isTimerRunning11 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton16() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer16();
                resetThresholdsToOriginal16();
                resetseconds16();
                resetButtonColor16();
                btnTimer16.clearAnimation();
                flashing16 = false;flashingg16 = false;
                isTimerRunning16 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton17() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer17();
                resetThresholdsToOriginal17();
                resetseconds17();
                resetButtonColor17();
                btnTimer17.clearAnimation();
                flashing17 = false;flashingg17 = false;
                isTimerRunning17 = false;


                dialog.dismiss();
            }

        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton18() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer18();
                resetThresholdsToOriginal18();
                resetseconds18();
                resetButtonColor18();
                btnTimer18.clearAnimation();
                flashing18 = false;flashingg18 = false;
                isTimerRunning18 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton19() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer19();
                resetThresholdsToOriginal19();
                resetseconds19();
                resetButtonColor19();
                btnTimer19.clearAnimation();
                flashing19 = false;flashingg19 = false;
                isTimerRunning19 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton20() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer20();
                resetThresholdsToOriginal20();
                resetseconds20();
                resetButtonColor20();
                btnTimer20.clearAnimation();
                flashing20 = false;flashingg20 = false;
                isTimerRunning20 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton21() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer21();
                resetThresholdsToOriginal21();
                resetseconds21();
                resetButtonColor21();
                btnTimer21.clearAnimation();
                flashing21 = false;flashingg21 = false;
                isTimerRunning21 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton22() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer22();
                resetThresholdsToOriginal22();
                resetseconds22();
                resetButtonColor22();
                btnTimer22.clearAnimation();
                flashing22 = false;flashingg22 = false;
                isTimerRunning22 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton23() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer23();
                resetThresholdsToOriginal23();
                resetseconds23();
                resetButtonColor23();
                btnTimer23.clearAnimation();
                flashing23 = false;flashingg23 = false;
                isTimerRunning23 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton24() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer24();
                resetThresholdsToOriginal24();
                resetseconds24();
                resetButtonColor24();
                btnTimer24.clearAnimation();
                flashing24 = false;flashingg24 = false;
                isTimerRunning24 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton25() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer25();
                resetThresholdsToOriginal25();
                resetseconds25();
                resetButtonColor25();
                btnTimer25.clearAnimation();
                flashing25 = false;flashingg25 = false;
                isTimerRunning25 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton27RR() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer27RR();
                resetThresholdsToOriginal27RR();
                resetseconds27RR();
                resetButtonColor27RR();
                btnTimer27RR.clearAnimation();
                flashing27RR = false;flashingg27RR = false;
                isTimerRunning27RR = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }


    private void showConfirmationDialogYNForButton28RR() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer28RR();
                resetThresholdsToOriginal28RR();
                resetseconds28RR();
                resetButtonColor28RR();
                btnTimer28RR.clearAnimation();
                flashing28RR = false;flashingg28RR = false;
                isTimerRunning28RR = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton66() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer66();
                resetThresholdsToOriginal66();
                resetseconds66();
                resetButtonColor66();
                btnTimer66.clearAnimation();
                flashing66 = false;flashingg66 = false;
                isTimerRunning66 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton201() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer201();
                resetThresholdsToOriginal201();
                resetseconds201();
                resetButtonColor201();
                btnTimer201.clearAnimation();
                flashing201 = false;flashingg201 = false;
                isTimerRunning201 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton202() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer202();
                resetThresholdsToOriginal202();
                resetseconds202();
                resetButtonColor202();
                btnTimer202.clearAnimation();
                flashing202 = false;flashingg202 = false;
                isTimerRunning202 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton203() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer203();
                resetThresholdsToOriginal203();
                resetseconds203();
                resetButtonColor203();
                btnTimer203.clearAnimation();
                flashing203 = false;flashingg203 = false;
                isTimerRunning203 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton204() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer204();
                resetThresholdsToOriginal204();
                resetseconds204();
                resetButtonColor204();
                btnTimer204.clearAnimation();
                flashing204 = false;flashingg204 = false;
                isTimerRunning204 = false;



                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton26RR() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer26RR();
                resetThresholdsToOriginal26RR();
                resetseconds26RR();
                resetButtonColor26RR();
                btnTimer26RR.clearAnimation();
                flashing26RR = false;flashingg26RR = false;
                isTimerRunning26RR = false;



                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_1 = true;
                isTimerRunning1 = true;
                startTime1r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1 = Calendar.getInstance();
                currentHour1 = currentTime1.get(Calendar.HOUR_OF_DAY);
                currentMinute1 = currentTime1.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_1 = false;
                isTimerRunning1 = true;
                startTime1r();
                flashing1 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHour1 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinute1 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }


    private void showConfirmationDialogForButton2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_2 = true;isTimerRunning2 = true;
                startTime2r();
                dialog.dismiss();
                Calendar currentTime2 = Calendar.getInstance();
                currentHour2 = currentTime2.get(Calendar.HOUR_OF_DAY);
                currentMinute2 = currentTime2.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_2 = false;isTimerRunning2 = true;
                startTime2r();
                dialog.dismiss();
                flashing2 = true;
                Calendar currentTime2 = Calendar.getInstance();
                currentHour2 = currentTime2.get(Calendar.HOUR_OF_DAY);
                currentMinute2 = currentTime2.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_3 = true;isTimerRunning3 = true;
                startTime3r();
                dialog.dismiss();
                Calendar currentTime3 = Calendar.getInstance();
                currentHour3 = currentTime3.get(Calendar.HOUR_OF_DAY);
                currentMinute3 = currentTime3.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_3 = false;isTimerRunning3 = true;
                startTime3r();
                dialog.dismiss();
                flashing3 = true;
                Calendar currentTime3 = Calendar.getInstance();
                currentHour3 = currentTime3.get(Calendar.HOUR_OF_DAY);
                currentMinute3 = currentTime3.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_4 = true;isTimerRunning4 = true;
                startTime4r();
                dialog.dismiss();
                Calendar currentTime4 = Calendar.getInstance();
                currentHour4 = currentTime4.get(Calendar.HOUR_OF_DAY);
                currentMinute4 = currentTime4.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_4 = false;isTimerRunning4 = true;
                startTime4r();
                dialog.dismiss();
                flashing4 = true;
                Calendar currentTime4 = Calendar.getInstance();
                currentHour4 = currentTime4.get(Calendar.HOUR_OF_DAY);
                currentMinute4 = currentTime4.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_5 = true;isTimerRunning5 = true;
                startTime5r();
                dialog.dismiss();
                Calendar currentTime5 = Calendar.getInstance();
                currentHour5 = currentTime5.get(Calendar.HOUR_OF_DAY);
                currentMinute5 = currentTime5.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_5 = false;isTimerRunning5 = true;
                startTime5r();
                dialog.dismiss();
                flashing5 = true;
                Calendar currentTime5 = Calendar.getInstance();
                currentHour5 = currentTime5.get(Calendar.HOUR_OF_DAY);
                currentMinute5 = currentTime5.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }



    private void showConfirmationDialogForButton7() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_7 = true;isTimerRunning7 = true;
                startTime7r();
                dialog.dismiss();
                Calendar currentTime7 = Calendar.getInstance();
                currentHour7 = currentTime7.get(Calendar.HOUR_OF_DAY);
                currentMinute7 = currentTime7.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_7 = false;isTimerRunning7 = true;
                startTime7r();
                dialog.dismiss();
                flashing7 = true;
                Calendar currentTime7 = Calendar.getInstance();
                currentHour7 = currentTime7.get(Calendar.HOUR_OF_DAY);
                currentMinute7 = currentTime7.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton8() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_8 = true;isTimerRunning8 = true;
                startTime8r();
                dialog.dismiss();

                Calendar currentTime8 = Calendar.getInstance();
                currentHour8 = currentTime8.get(Calendar.HOUR_OF_DAY);
                currentMinute8 = currentTime8.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_8 = false;isTimerRunning8 = true;
                startTime8r();
                dialog.dismiss();
                flashing8 = true;

                Calendar currentTime8 = Calendar.getInstance();
                currentHour8 = currentTime8.get(Calendar.HOUR_OF_DAY);
                currentMinute8 = currentTime8.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton9() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_9 = true;isTimerRunning9 = true;
                startTime9r();
                dialog.dismiss();

                Calendar currentTime9 = Calendar.getInstance();
                currentHour9 = currentTime9.get(Calendar.HOUR_OF_DAY);
                currentMinute9 = currentTime9.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_9 = false;isTimerRunning9 = true;
                startTime9r();
                dialog.dismiss();
                flashing9 = true;

                Calendar currentTime9 = Calendar.getInstance();
                currentHour9 = currentTime9.get(Calendar.HOUR_OF_DAY);
                currentMinute9 = currentTime9.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton10() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_10 = true;isTimerRunning10 = true;
                startTime10r();
                dialog.dismiss();

                Calendar currentTime10 = Calendar.getInstance();
                currentHour10 = currentTime10.get(Calendar.HOUR_OF_DAY);
                currentMinute10 = currentTime10.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_10 = false;isTimerRunning10 = true;
                startTime10r();
                dialog.dismiss();
                flashing10 = true;

                Calendar currentTime10 = Calendar.getInstance();
                currentHour10 = currentTime10.get(Calendar.HOUR_OF_DAY);
                currentMinute10 = currentTime10.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton11() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_11 = true;isTimerRunning11 = true;
                startTime11r();
                dialog.dismiss();

                Calendar currentTime11 = Calendar.getInstance();
                currentHour11 = currentTime11.get(Calendar.HOUR_OF_DAY);
                currentMinute11 = currentTime11.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_11 = false;isTimerRunning11 = true;
                startTime11r();
                dialog.dismiss();
                flashing11 = true;

                Calendar currentTime11 = Calendar.getInstance();
                currentHour11 = currentTime11.get(Calendar.HOUR_OF_DAY);
                currentMinute11 = currentTime11.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton16() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_16 = true;isTimerRunning16 = true;
                startTime16r();
                dialog.dismiss();
                Calendar currentTime16 = Calendar.getInstance();
                currentHour16 = currentTime16.get(Calendar.HOUR_OF_DAY);
                currentMinute16 = currentTime16.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_16 = false;isTimerRunning16 = true;
                startTime16r();
                dialog.dismiss();
                flashing16 = true;
                Calendar currentTime16 = Calendar.getInstance();
                currentHour16 = currentTime16.get(Calendar.HOUR_OF_DAY);
                currentMinute16 = currentTime16.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton17() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_17 = true;isTimerRunning17 = true;
                startTime17r();
                dialog.dismiss();

                Calendar currentTime17 = Calendar.getInstance();
                currentHour17 = currentTime17.get(Calendar.HOUR_OF_DAY);
                currentMinute17 = currentTime17.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_17 = false;isTimerRunning17 = true;
                startTime17r();
                dialog.dismiss();
                flashing17 = true;

                Calendar currentTime17 = Calendar.getInstance();
                currentHour17 = currentTime17.get(Calendar.HOUR_OF_DAY);
                currentMinute17 = currentTime17.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton18() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_18 = true;isTimerRunning18 = true;
                startTime18r();
                dialog.dismiss();

                Calendar currentTime18 = Calendar.getInstance();
                currentHour18 = currentTime18.get(Calendar.HOUR_OF_DAY);
                currentMinute18 = currentTime18.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_18 = false;isTimerRunning18 = true;
                startTime18r();
                dialog.dismiss();
                flashing18 = true;

                Calendar currentTime18 = Calendar.getInstance();
                currentHour18 = currentTime18.get(Calendar.HOUR_OF_DAY);
                currentMinute18 = currentTime18.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton19() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_19 = true;isTimerRunning19 = true;
                startTime19r();
                dialog.dismiss();

                Calendar currentTime19 = Calendar.getInstance();
                currentHour19 = currentTime19.get(Calendar.HOUR_OF_DAY);
                currentMinute19 = currentTime19.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_19 = false;isTimerRunning19 = true;
                startTime19r();
                dialog.dismiss();
                flashing19 = true;

                Calendar currentTime19 = Calendar.getInstance();
                currentHour19 = currentTime19.get(Calendar.HOUR_OF_DAY);
                currentMinute19 = currentTime19.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton20() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_20 = true;isTimerRunning20 = true;
                startTime20r();
                dialog.dismiss();

                Calendar currentTime20 = Calendar.getInstance();
                currentHour20 = currentTime20.get(Calendar.HOUR_OF_DAY);
                currentMinute20 = currentTime20.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_20 = false;isTimerRunning20 = true;
                startTime20r();
                dialog.dismiss();
                flashing20 = true;

                Calendar currentTime20 = Calendar.getInstance();
                currentHour20 = currentTime20.get(Calendar.HOUR_OF_DAY);
                currentMinute20 = currentTime20.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton21() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_21 = true;isTimerRunning21 = true;
                startTime21r();
                dialog.dismiss();

                Calendar currentTime21 = Calendar.getInstance();
                currentHour21 = currentTime21.get(Calendar.HOUR_OF_DAY);
                currentMinute21 = currentTime21.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_21 = false;isTimerRunning21 = true;
                startTime21r();
                dialog.dismiss();
                flashing21 = true;

                Calendar currentTime21 = Calendar.getInstance();
                currentHour21 = currentTime21.get(Calendar.HOUR_OF_DAY);
                currentMinute21 = currentTime21.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton22() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_22 = true;isTimerRunning22 = true;
                startTime22r();
                dialog.dismiss();

                Calendar currentTime22 = Calendar.getInstance();
                currentHour22 = currentTime22.get(Calendar.HOUR_OF_DAY);
                currentMinute22 = currentTime22.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_22 = false;isTimerRunning22 = true;
                startTime22r();
                dialog.dismiss();
                flashing22= true;

                Calendar currentTime22 = Calendar.getInstance();
                currentHour22 = currentTime22.get(Calendar.HOUR_OF_DAY);
                currentMinute22 = currentTime22.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton23() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_23 = true;isTimerRunning23 = true;
                startTime23r();
                dialog.dismiss();

                Calendar currentTime23 = Calendar.getInstance();
                currentHour23 = currentTime23.get(Calendar.HOUR_OF_DAY);
                currentMinute23 = currentTime23.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_23 = false;isTimerRunning23 = true;
                startTime23r();
                dialog.dismiss();
                flashing23 = true;

                Calendar currentTime23 = Calendar.getInstance();
                currentHour23 = currentTime23.get(Calendar.HOUR_OF_DAY);
                currentMinute23 = currentTime23.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton24() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_24 = true;isTimerRunning24 = true;
                startTime24r();
                dialog.dismiss();

                Calendar currentTime24 = Calendar.getInstance();
                currentHour24 = currentTime24.get(Calendar.HOUR_OF_DAY);
                currentMinute24 = currentTime24.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_24 = false;isTimerRunning24 = true;
                startTime24r();
                dialog.dismiss();
                flashing24 = true;

                Calendar currentTime24 = Calendar.getInstance();
                currentHour24 = currentTime24.get(Calendar.HOUR_OF_DAY);
                currentMinute24 = currentTime24.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton25() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_25 = true;isTimerRunning25 = true;
                startTime25r();
                dialog.dismiss();

                Calendar currentTime25 = Calendar.getInstance();
                currentHour25 = currentTime25.get(Calendar.HOUR_OF_DAY);
                currentMinute25 = currentTime25.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_25 = false;isTimerRunning25 = true;
                startTime25r();
                dialog.dismiss();
                flashing25 = true;

                Calendar currentTime25 = Calendar.getInstance();
                currentHour25 = currentTime25.get(Calendar.HOUR_OF_DAY);
                currentMinute25 = currentTime25.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton27RR() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_27RR = true;isTimerRunning27RR = true;
                startTime27RRr();
                dialog.dismiss();

                Calendar currentTime27RR = Calendar.getInstance();
                currentHour27RR = currentTime27RR.get(Calendar.HOUR_OF_DAY);
                currentMinute27RR = currentTime27RR.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_27RR = false;isTimerRunning27RR = true;
                startTime27RRr();
                dialog.dismiss();
                flashing27RR = true;

                Calendar currentTime27RR = Calendar.getInstance();
                currentHour27RR = currentTime27RR.get(Calendar.HOUR_OF_DAY);
                currentMinute27RR = currentTime27RR.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton28RR() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_28RR = true;isTimerRunning28RR = true;
                startTime28RRr();
                dialog.dismiss();

                Calendar currentTime28RR = Calendar.getInstance();
                currentHour28RR = currentTime28RR.get(Calendar.HOUR_OF_DAY);
                currentMinute28RR = currentTime28RR.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_28RR = false;isTimerRunning28RR = true;
                startTime28RRr();
                dialog.dismiss();
                flashing28RR = true;

                Calendar currentTime28RR = Calendar.getInstance();
                currentHour28RR = currentTime28RR.get(Calendar.HOUR_OF_DAY);
                currentMinute28RR = currentTime28RR.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton66() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_66 = true;isTimerRunning66 = true;
                startTime66r();
                dialog.dismiss();

                Calendar currentTime66 = Calendar.getInstance();
                currentHour66 = currentTime66.get(Calendar.HOUR_OF_DAY);
                currentMinute66 = currentTime66.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_66 = false;isTimerRunning66 = true;
                startTime66r();
                dialog.dismiss();
                flashing66 = true;

                Calendar currentTime66 = Calendar.getInstance();
                currentHour66 = currentTime66.get(Calendar.HOUR_OF_DAY);
                currentMinute66 = currentTime66.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton201() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_12 = true;isTimerRunning201 = true;
                startTime201r();
                dialog.dismiss();

                Calendar currentTime12 = Calendar.getInstance();
                currentHour12 = currentTime12.get(Calendar.HOUR_OF_DAY);
                currentMinute12 = currentTime12.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_12 = false;isTimerRunning201 = true;
                startTime201r();
                dialog.dismiss();
                flashing201 = true;

                Calendar currentTime12 = Calendar.getInstance();
                currentHour12 = currentTime12.get(Calendar.HOUR_OF_DAY);
                currentMinute12 = currentTime12.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton202() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_13 = true;isTimerRunning202 = true;
                startTime202r();
                dialog.dismiss();

                Calendar currentTime13 = Calendar.getInstance();
                currentHour13 = currentTime13.get(Calendar.HOUR_OF_DAY);
                currentMinute13 = currentTime13.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_13 = false;isTimerRunning202 = true;
                startTime202r();
                dialog.dismiss();
                flashing202 = true;

                Calendar currentTime13 = Calendar.getInstance();
                currentHour13 = currentTime13.get(Calendar.HOUR_OF_DAY);
                currentMinute13 = currentTime13.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton203() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_14 = true;isTimerRunning203 = true;
                startTime203r();
                dialog.dismiss();

                Calendar currentTime14 = Calendar.getInstance();
                currentHour14 = currentTime14.get(Calendar.HOUR_OF_DAY);
                currentMinute14 = currentTime14.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_14 = false;isTimerRunning203 = true;
                startTime203r();
                dialog.dismiss();
                flashing203 = true;

                Calendar currentTime14 = Calendar.getInstance();
                currentHour14 = currentTime14.get(Calendar.HOUR_OF_DAY);
                currentMinute14 = currentTime14.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton204() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_15 = true;isTimerRunning204 = true;
                startTime204r();
                dialog.dismiss();

                Calendar currentTime15 = Calendar.getInstance();
                currentHour15 = currentTime15.get(Calendar.HOUR_OF_DAY);
                currentMinute15 = currentTime15.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_15 = false;isTimerRunning204 = true;
                startTime204r();
                dialog.dismiss();
                flashing204 = true;

                Calendar currentTime15 = Calendar.getInstance();
                currentHour15 = currentTime15.get(Calendar.HOUR_OF_DAY);
                currentMinute15 = currentTime15.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton26RR() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_26RR = true;isTimerRunning26RR = true;
                startTime26RRr();
                dialog.dismiss();
                Calendar currentTime26RR = Calendar.getInstance();
                currentHour26RR = currentTime26RR.get(Calendar.HOUR_OF_DAY);
                currentMinute26RR = currentTime26RR.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people2_26RR = false;isTimerRunning26RR = true;
                startTime26RRr();
                dialog.dismiss();
                flashing26RR = true;
                Calendar currentTime26RR = Calendar.getInstance();
                currentHour26RR = currentTime26RR.get(Calendar.HOUR_OF_DAY);
                currentMinute26RR = currentTime26RR.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }



    private void startTime1r() {
        startTime1 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread1, 0);
    }
    private void startTime2r() {
        startTime2 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread2, 0);
    }

    private void startTime3r() {
        startTime3 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread3, 0);
    }

    private void startTime4r() {
        startTime4 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread4, 0);
    }
    private void startTime5r() {
        startTime5 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread5, 0);
    }



    private void startTime7r() {
        startTime7 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread7, 0);
    }

    private void startTime8r() {
        startTime8 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread8, 0);
    }

    private void startTime9r() {
        startTime9 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread9, 0);
    }
    private void startTime10r() {
        startTime10 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread10, 0);
    }
    private void startTime11r() {
        startTime11 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread11, 0);
    }
    private void startTime16r() {
        startTime16 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread16, 0);
    }
    private void startTime17r() {
        startTime17 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread17, 0);
    }
    private void startTime18r() {
        startTime18 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread18, 0);
    }

    private void startTime19r() {
        startTime19 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread19, 0);
    }

    private void startTime20r() {
        startTime20 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread20, 0);
    }

    private void startTime21r() {
        startTime21 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread21, 0);
    }
    private void startTime22r() {
        startTime22 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread22, 0);
    }

    private void startTime23r() {
        startTime23 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread23, 0);
    }

    private void startTime24r() {
        startTime24 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread24, 0);
    }

    private void startTime25r() {
        startTime25 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread25, 0);
    }
/*
    private void startTime266r() {
        startTime266 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread266, 0);
    }*/

    private void startTime27RRr() {
        startTime27RR = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread27RR, 0);
    }

    private void startTime28RRr() {
        startTime28RR = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread28RR, 0);
    }
    private void startTime66r() {
        startTime66 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread66, 0);
    }
    private void startTime201r() {
        startTime201 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread201, 0);
    }

    private void startTime202r() {
        startTime202 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread202, 0);
    }

    private void startTime203r() {
        startTime203 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread203, 0);
    }

    private void startTime204r() {
        startTime204 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread204, 0);
    }

    private void startTime26RRr() {
        startTime26RR = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread26RR, 0);
    }




    private void resetThresholdsToOriginal1() {
        //此為測試用 正式版應改為originalyellowThreshold2
        yellowThreshold1 = originalyellowThreshold2;
        redThreshold1 = originalredThreshold2;
        blueThreshold1 = originalblueThreshold2;
        //yellowThreshold1 = originalyellowThreshold2;
        //redThreshold1 = originalredThreshold2;
        //blueThreshold1 = originalblueThreshold2;
        //此為測試用
    }
    private void resetThresholdsToOriginal2() {
        yellowThreshold2 = originalyellowThreshold2;
        redThreshold2 = originalredThreshold2;
        blueThreshold2 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal3() {
        yellowThreshold3 = originalyellowThreshold2;
        redThreshold3 = originalredThreshold2;
        blueThreshold3 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal4() {
        yellowThreshold4 = originalyellowThreshold2;
        redThreshold4 = originalredThreshold2;
        blueThreshold4 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal5() {
        yellowThreshold5 = originalyellowThreshold2;
        redThreshold5 = originalredThreshold2;
        blueThreshold5 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal6() {
        yellowThreshold6 = originalyellowThreshold2;
        redThreshold6 = originalredThreshold2;
        blueThreshold6 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal7() {
        yellowThreshold7 = originalyellowThreshold2;
        redThreshold7 = originalredThreshold2;
        blueThreshold7 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal8() {
        yellowThreshold8 = originalyellowThreshold2;
        redThreshold8 = originalredThreshold2;
        blueThreshold8 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal9() {
        yellowThreshold9 = originalyellowThreshold2;
        redThreshold9 = originalredThreshold2;
        blueThreshold9 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal10() {
        yellowThreshold10 = originalyellowThreshold2;
        redThreshold10 = originalredThreshold2;
        blueThreshold10 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal11() {
        yellowThreshold11 = originalyellowThreshold2;
        redThreshold11 = originalredThreshold2;
        blueThreshold11 = originalblueThreshold2;
    }
    private void resetThresholdsToOriginal16() {
        yellowThreshold16 = originalyellowThreshold2;
        redThreshold16 = originalredThreshold2;
        blueThreshold16 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal17() {
        yellowThreshold17 = originalyellowThreshold2;
        redThreshold17 = originalredThreshold2;
        blueThreshold17 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal18() {
        yellowThreshold18 = originalyellowThreshold2;
        redThreshold18 = originalredThreshold2;
        blueThreshold18 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal19() {
        yellowThreshold19 = originalyellowThreshold2;
        redThreshold19 = originalredThreshold2;
        blueThreshold19 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal20() {
        yellowThreshold20 = originalyellowThreshold2;
        redThreshold20 = originalredThreshold2;
        blueThreshold20 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal21() {
        yellowThreshold21 = originalyellowThreshold2;
        redThreshold21 = originalredThreshold2;
        blueThreshold21 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal22() {
        yellowThreshold22 = originalyellowThreshold2;
        redThreshold22 = originalredThreshold2;
        blueThreshold22 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal23() {
        yellowThreshold23 = originalyellowThreshold2;
        redThreshold23 = originalredThreshold2;
        blueThreshold23 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal24() {
        yellowThreshold24 = originalyellowThreshold2;
        redThreshold24 = originalredThreshold2;
        blueThreshold24 = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal25() {
        yellowThreshold25 = originalyellowThreshold2;
        redThreshold25 = originalredThreshold2;
        blueThreshold25 = originalblueThreshold2;
    }

/*    private void resetThresholdsToOriginal266() {
        yellowThreshold266 = originalyellowThreshold2;
        redThreshold266 = originalredThreshold2;
        blueThreshold266 = originalblueThreshold2;
    }*/

    private void resetThresholdsToOriginal27RR() {
        yellowThreshold27RR = originalyellowThreshold2;
        redThreshold27RR = originalredThreshold2;
        blueThreshold27RR = originalblueThreshold2;
    }

    private void resetThresholdsToOriginal28RR() {
        yellowThreshold28RR = originalyellowThreshold2;
        redThreshold28RR = originalredThreshold2;
        blueThreshold28RR = originalblueThreshold2;
    }
    private void resetThresholdsToOriginal66() {
        yellowThreshold66 = originalyellowThreshold2;
        redThreshold66 = originalredThreshold2;
        blueThreshold66 = originalblueThreshold2;
    }
    private void resetThresholdsToOriginal201() {
        yellowThreshold201 = originalyellowThreshold3;
        redThreshold201 = originalredThreshold3;
        blueThreshold201 = originalblueThreshold3;
    }

    private void resetThresholdsToOriginal202() {
        yellowThreshold202 = originalyellowThreshold3;
        redThreshold202 = originalredThreshold3;
        blueThreshold202 = originalblueThreshold3;
    }

    private void resetThresholdsToOriginal203() {
        yellowThreshold203 = originalyellowThreshold3;
        redThreshold203 = originalredThreshold3;
        blueThreshold203 = originalblueThreshold3;
    }

    private void resetThresholdsToOriginal204() {
        yellowThreshold204 = originalyellowThreshold3;
        redThreshold204 = originalredThreshold3;
        blueThreshold204 = originalblueThreshold3;
    }

    private void resetThresholdsToOriginal26RR() {
        yellowThreshold26RR = originalyellowThreshold2;
        redThreshold26RR = originalredThreshold2;
        blueThreshold26RR = originalblueThreshold2;
    }

    private Runnable updateTimerThread1 = new Runnable() {
        public void run() {
            timeInMilliseconds1 = SystemClock.uptimeMillis() - startTime1;
            updatedTime1 = timeInMilliseconds1;
            seconds1 = (int) (updatedTime1 / 1000);
            minutes1 = seconds1 / 60;
            hours1 = minutes1 / 60;
            seconds1 = seconds1 % 60;
            minutes1 = minutes1 % 60;
            sec1 = hours1 * 3600 + minutes1 * 60 + seconds1;

            // 计算当前时间加上 redThreshold1 后的时间（秒数）
            int totalSeconds = currentHour1 * 60 * 60 + currentMinute1 * 60 + redThreshold1;
            // 计算小时和分钟
            futureHour1 = totalSeconds / 3600;
            futureMinute1 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour1 >= 24) {
                futureHour1 %= 24;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour1, currentMinute1);
            String futureTimeString = String.format("%02d:%02d", futureHour1, futureMinute1);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer1.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer1.setText(Html.fromHtml(displayText));
            }

            updateButtonColor1();
            handler1.postDelayed(this, 1000);
        }
    };




    private Runnable updateTimerThread2 = new Runnable() {
        public void run() {
            timeInMilliseconds2 = SystemClock.uptimeMillis() - startTime2;
            updatedTime2 = timeInMilliseconds2;
            seconds2 = (int) (updatedTime2 / 1000);
            minutes2 = seconds2 / 60;
            hours2 = minutes2 / 60;
            seconds2 = seconds2 % 60;
            minutes2 = minutes2 % 60;
            sec2 = hours2 * 3600 + minutes2 * 60 + seconds2;

            // 计算当前时间加上 redThreshold2 后的时间（秒数）
            int totalSeconds = currentHour2 * 60 * 60 + currentMinute2 * 60 + redThreshold2;
            // 计算小时和分钟
            futureHour2 = totalSeconds / 3600;
            futureMinute2 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour2 >= 24) {
                futureHour2 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour2, currentMinute2);
            String futureTimeString = String.format("%02d:%02d", futureHour2, futureMinute2);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer2.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer2.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread3 = new Runnable() {
        public void run() {
            timeInMilliseconds3 = SystemClock.uptimeMillis() - startTime3;
            updatedTime3 = timeInMilliseconds3;
            seconds3 = (int) (updatedTime3 / 1000);
            minutes3 = seconds3 / 60;
            hours3 = minutes3 / 60;
            seconds3 = seconds3 % 60;
            minutes3 = minutes3 % 60;
            sec3 = hours3 * 3600 + minutes3 * 60 + seconds3;

// 计算当前时间加上 redThreshold3 后的时间（秒数）
            int totalSeconds = currentHour3 * 60 * 60 + currentMinute3 * 60 + redThreshold3;
            // 计算小时和分钟
            futureHour3 = totalSeconds / 3600;
            futureMinute3 = (totalSeconds % 3600) / 60;
            // 处理超过34小时的进位
            if (futureHour3 >= 24) {
                futureHour3 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour3, currentMinute3);
            String futureTimeString = String.format("%02d:%02d", futureHour3, futureMinute3);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer3.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer3.setText(Html.fromHtml(displayText));
            }

            updateButtonColor3();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread4 = new Runnable() {
        public void run() {
            timeInMilliseconds4 = SystemClock.uptimeMillis() - startTime4;
            updatedTime4 = timeInMilliseconds4;
            seconds4 = (int) (updatedTime4 / 1000);
            minutes4 = seconds4 / 60;
            hours4 = minutes4 / 60;
            seconds4 = seconds4 % 60;
            minutes4 = minutes4 % 60;
            sec4 =hours4 * 3600 + minutes4 * 60 + seconds4;


            // 计算当前时间加上 redThreshold4 后的时间（秒数）
            int totalSeconds = currentHour4 * 60 * 60 + currentMinute4 * 60 + redThreshold4;
            // 计算小时和分钟
            futureHour4 = totalSeconds / 3600;
            futureMinute4 = (totalSeconds % 3600) / 60;
            // 处理超过44小时的进位
            if (futureHour4 >= 24) {
                futureHour4 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour4, currentMinute4);
            String futureTimeString = String.format("%02d:%02d", futureHour4, futureMinute4);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer4.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer4.setText(Html.fromHtml(displayText));
            }

            updateButtonColor4();
            handler1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThread5 = new Runnable() {
        public void run() {
            timeInMilliseconds5 = SystemClock.uptimeMillis() - startTime5;
            updatedTime5 = timeInMilliseconds5;
            seconds5 = (int) (updatedTime5 / 1000);
            minutes5 = seconds5 / 60;
            hours5 = minutes5 / 60;
            seconds5 = seconds5 % 60;
            minutes5 = minutes5 % 60;
            sec5 =hours5 * 3600 + minutes5 * 60 + seconds5;



            // 计算当前时间加上 redThreshold5 后的时间（秒数）
            int totalSeconds = currentHour5 * 60 * 60 + currentMinute5 * 60 + redThreshold5;
            // 计算小时和分钟
            futureHour5 = totalSeconds / 3600;
            futureMinute5 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour5 >= 24) {
                futureHour5 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour5, currentMinute5);
            String futureTimeString = String.format("%02d:%02d", futureHour5, futureMinute5);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer5.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer5.setText(Html.fromHtml(displayText));
            }

            updateButtonColor5();
            handler1.postDelayed(this, 1000);
        }
    };



    private Runnable updateTimerThread7 = new Runnable() {
        public void run() {
            timeInMilliseconds7 = SystemClock.uptimeMillis() - startTime7;
            updatedTime7 = timeInMilliseconds7;
            seconds7 = (int) (updatedTime7 / 1000);
            minutes7 = seconds7 / 60;
            hours7 = minutes7 / 60;
            seconds7 = seconds7 % 60;
            minutes7 = minutes7 % 60;
            sec7 =hours7 * 3600 + minutes7 * 60 + seconds7;



            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour7 * 60 * 60 + currentMinute7 * 60 + redThreshold7;
            // 计算小时和分钟
            futureHour7 = totalSeconds / 3600;
            futureMinute7 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour7 >= 24) {
                futureHour7 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour7, currentMinute7);
            String futureTimeString = String.format("%02d:%02d", futureHour7, futureMinute7);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer7.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer7.setText(Html.fromHtml(displayText));
            }

            updateButtonColor7();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread8 = new Runnable() {
        public void run() {
            timeInMilliseconds8 = SystemClock.uptimeMillis() - startTime8;
            updatedTime8 = timeInMilliseconds8;
            seconds8 = (int) (updatedTime8 / 1000);
            minutes8 = seconds8 / 60;
            hours8 = minutes8 / 60;
            seconds8 = seconds8 % 60;
            minutes8 = minutes8 % 60;
            sec8 =hours8 * 3600 + minutes8 * 60 + seconds8;



            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour8 * 60 * 60 + currentMinute8 * 60 + redThreshold8;
            // 计算小时和分钟
            futureHour8 = totalSeconds / 3600;
            futureMinute8 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour8 >= 24) {
                futureHour8 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour8, currentMinute8);
            String futureTimeString = String.format("%02d:%02d", futureHour8, futureMinute8);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer8.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer8.setText(Html.fromHtml(displayText));
            }

            updateButtonColor8();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread9 = new Runnable() {
        public void run() {
            timeInMilliseconds9 = SystemClock.uptimeMillis() - startTime9;
            updatedTime9 = timeInMilliseconds9;
            seconds9 = (int) (updatedTime9 / 1000);
            minutes9 = seconds9 / 60;
            hours9 = minutes9 / 60;
            seconds9 = seconds9 % 60;
            minutes9 = minutes9 % 60;
            sec9 =hours9 * 3600 + minutes9 * 60 + seconds9;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour9 * 60 * 60 + currentMinute9 * 60 + redThreshold9;
            // 计算小时和分钟
            futureHour9 = totalSeconds / 3600;
            futureMinute9 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour9 >= 24) {
                futureHour9 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour9, currentMinute9);
            String futureTimeString = String.format("%02d:%02d", futureHour9, futureMinute9);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer9.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer9.setText(Html.fromHtml(displayText));
            }

            updateButtonColor9();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread10 = new Runnable() {
        public void run() {
            timeInMilliseconds10 = SystemClock.uptimeMillis() - startTime10;
            updatedTime10 = timeInMilliseconds10;
            seconds10 = (int) (updatedTime10 / 1000);
            minutes10 = seconds10 / 60;
            hours10 = minutes10 / 60;
            seconds10 = seconds10 % 60;
            minutes10 = minutes10 % 60;
            sec10 =hours10 * 3600 + minutes10 * 60 + seconds10;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour10 * 60 * 60 + currentMinute10 * 60 + redThreshold10;
            // 计算小时和分钟
            futureHour10 = totalSeconds / 3600;
            futureMinute10 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour10 >= 24) {
                futureHour10 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour10, currentMinute10);
            String futureTimeString = String.format("%02d:%02d", futureHour10, futureMinute10);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer10.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer10.setText(Html.fromHtml(displayText));
            }

            updateButtonColor10();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread11 = new Runnable() {
        public void run() {
            timeInMilliseconds11 = SystemClock.uptimeMillis() - startTime11;
            updatedTime11 = timeInMilliseconds11;
            seconds11 = (int) (updatedTime11 / 1000);
            minutes11 = seconds11 / 60;
            hours11 = minutes11 / 60;
            seconds11 = seconds11 % 60;
            minutes11 = minutes11 % 60;
            sec11 =hours11 * 3600 + minutes11 * 60 + seconds11;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour11 * 60 * 60 + currentMinute11 * 60 + redThreshold11;
            // 计算小时和分钟
            futureHour11 = totalSeconds / 3600;
            futureMinute11 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour11 >= 24) {
                futureHour11 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour11, currentMinute11);
            String futureTimeString = String.format("%02d:%02d", futureHour11, futureMinute11);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer11.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer11.setText(Html.fromHtml(displayText));
            }

            updateButtonColor11();
            handler1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThread16 = new Runnable() {
        public void run() {
            timeInMilliseconds16 = SystemClock.uptimeMillis() - startTime16;
            updatedTime16 = timeInMilliseconds16;
            seconds16 = (int) (updatedTime16 / 1000);
            minutes16 = seconds16 / 60;
            hours16 = minutes16 / 60;
            seconds16 = seconds16 % 60;
            minutes16 = minutes16 % 60;
            sec16 =hours16 * 3600 + minutes16 * 60 + seconds16;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour16 * 60 * 60 + currentMinute16 * 60 + redThreshold16;
            // 计算小时和分钟
            futureHour16 = totalSeconds / 3600;
            futureMinute16 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour16 >= 24) {
                futureHour16 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour16, currentMinute16);
            String futureTimeString = String.format("%02d:%02d", futureHour16, futureMinute16);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer16.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer16.setText(Html.fromHtml(displayText));
            }

            updateButtonColor16();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread17 = new Runnable() {
        public void run() {
            timeInMilliseconds17 = SystemClock.uptimeMillis() - startTime17;
            updatedTime17 = timeInMilliseconds17;
            seconds17 = (int) (updatedTime17 / 1000);
            minutes17 = seconds17 / 60;
            hours17 = minutes17 / 60;
            seconds17 = seconds17 % 60;
            minutes17 = minutes17 % 60;
            sec17 =hours17 * 3600 + minutes17 * 60 + seconds17;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour17 * 60 * 60 + currentMinute17 * 60 + redThreshold17;
            // 计算小时和分钟
            futureHour17 = totalSeconds / 3600;
            futureMinute17 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour17 >= 24) {
                futureHour17 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour17, currentMinute17);
            String futureTimeString = String.format("%02d:%02d", futureHour17, futureMinute17);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer17.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer17.setText(Html.fromHtml(displayText));
            }

            updateButtonColor17();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread18 = new Runnable() {
        public void run() {
            timeInMilliseconds18 = SystemClock.uptimeMillis() - startTime18;
            updatedTime18 = timeInMilliseconds18;
            seconds18 = (int) (updatedTime18 / 1000);
            minutes18 = seconds18 / 60;
            hours18 = minutes18 / 60;
            seconds18 = seconds18 % 60;
            minutes18 = minutes18 % 60;
            sec18 =hours18 * 3600 + minutes18 * 60 + seconds18;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour18 * 60 * 60 + currentMinute18 * 60 + redThreshold18;
            // 计算小时和分钟
            futureHour18 = totalSeconds / 3600;
            futureMinute18 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour18 >= 24) {
                futureHour18 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour18, currentMinute18);
            String futureTimeString = String.format("%02d:%02d", futureHour18, futureMinute18);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer18.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer18.setText(Html.fromHtml(displayText));
            }

            updateButtonColor18();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread19 = new Runnable() {
        public void run() {
            timeInMilliseconds19 = SystemClock.uptimeMillis() - startTime19;
            updatedTime19 = timeInMilliseconds19;
            seconds19 = (int) (updatedTime19 / 1000);
            minutes19 = seconds19 / 60;
            hours19 = minutes19 / 60;
            seconds19 = seconds19 % 60;
            minutes19 = minutes19 % 60;
            sec19 =hours19 * 3600 + minutes19 * 60 + seconds19;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour19 * 60 * 60 + currentMinute19 * 60 + redThreshold19;
            // 计算小时和分钟
            futureHour19 = totalSeconds / 3600;
            futureMinute19 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour19 >= 24) {
                futureHour19 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour19, currentMinute19);
            String futureTimeString = String.format("%02d:%02d", futureHour19, futureMinute19);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer19.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer19.setText(Html.fromHtml(displayText));
            }

            updateButtonColor19();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread20 = new Runnable() {
        public void run() {
            timeInMilliseconds20 = SystemClock.uptimeMillis() - startTime20;
            updatedTime20 = timeInMilliseconds20;
            seconds20 = (int) (updatedTime20 / 1000);
            minutes20 = seconds20 / 60;
            hours20 = minutes20 / 60;
            seconds20 = seconds20 % 60;
            minutes20 = minutes20 % 60;
            sec20 =hours20 * 3600 + minutes20 * 60 + seconds20;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour20 * 60 * 60 + currentMinute20 * 60 + redThreshold20;
            // 计算小时和分钟
            futureHour20 = totalSeconds / 3600;
            futureMinute20 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour20 >= 24) {
                futureHour20 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour20, currentMinute20);
            String futureTimeString = String.format("%02d:%02d", futureHour20, futureMinute20);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer20.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer20.setText(Html.fromHtml(displayText));
            }

            updateButtonColor20();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread21 = new Runnable() {
        public void run() {
            timeInMilliseconds21 = SystemClock.uptimeMillis() - startTime21;
            updatedTime21 = timeInMilliseconds21;
            seconds21 = (int) (updatedTime21 / 1000);
            minutes21 = seconds21 / 60;
            hours21 = minutes21 / 60;
            seconds21 = seconds21 % 60;
            minutes21 = minutes21 % 60;
            sec21 =hours21 * 3600 + minutes21 * 60 + seconds21;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour21 * 60 * 60 + currentMinute21 * 60 + redThreshold21;
            // 计算小时和分钟
            futureHour21 = totalSeconds / 3600;
            futureMinute21 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour21 >= 24) {
                futureHour21 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour21, currentMinute21);
            String futureTimeString = String.format("%02d:%02d", futureHour21, futureMinute21);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer21.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer21.setText(Html.fromHtml(displayText));
            }

            updateButtonColor21();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread22 = new Runnable() {
        public void run() {
            timeInMilliseconds22 = SystemClock.uptimeMillis() - startTime22;
            updatedTime22 = timeInMilliseconds22;
            seconds22 = (int) (updatedTime22 / 1000);
            minutes22 = seconds22 / 60;
            hours22 = minutes22 / 60;
            seconds22 = seconds22 % 60;
            minutes22 = minutes22 % 60;
            sec22 =hours22 * 3600 + minutes22 * 60 + seconds22;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour22 * 60 * 60 + currentMinute22 * 60 + redThreshold22;
            // 计算小时和分钟
            futureHour22 = totalSeconds / 3600;
            futureMinute22 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour22 >= 24) {
                futureHour22 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour22, currentMinute22);
            String futureTimeString = String.format("%02d:%02d", futureHour22, futureMinute22);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer22.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer22.setText(Html.fromHtml(displayText));
            }

            updateButtonColor22();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread23 = new Runnable() {
        public void run() {
            timeInMilliseconds23 = SystemClock.uptimeMillis() - startTime23;
            updatedTime23 = timeInMilliseconds23;
            seconds23 = (int) (updatedTime23 / 1000);
            minutes23 = seconds23 / 60;
            hours23 = minutes23 / 60;
            seconds23 = seconds23 % 60;
            minutes23 = minutes23 % 60;
            sec23 =hours23 * 3600 + minutes23 * 60 + seconds23;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour23 * 60 * 60 + currentMinute23 * 60 + redThreshold23;
            // 计算小时和分钟
            futureHour23 = totalSeconds / 3600;
            futureMinute23 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour23 >= 24) {
                futureHour23 %= 24;
            }
            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour23, currentMinute23);
            String futureTimeString = String.format("%02d:%02d", futureHour23, futureMinute23);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer23.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer23.setText(Html.fromHtml(displayText));
            }

            updateButtonColor23();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread24 = new Runnable() {
        public void run() {
            timeInMilliseconds24 = SystemClock.uptimeMillis() - startTime24;
            updatedTime24 = timeInMilliseconds24;
            seconds24 = (int) (updatedTime24 / 1000);
            minutes24 = seconds24 / 60;
            hours24 = minutes24 / 60;
            seconds24 = seconds24 % 60;
            minutes24 = minutes24 % 60;
            sec24 =hours24 * 3600 + minutes24 * 60 + seconds24;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour24 * 60 * 60 + currentMinute24 * 60 + redThreshold24;
            // 计算小时和分钟
            futureHour24 = totalSeconds / 3600;
            futureMinute24 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour24 >= 24) {
                futureHour24 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour24, currentMinute24);
            String futureTimeString = String.format("%02d:%02d", futureHour24, futureMinute24);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer24.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer24.setText(Html.fromHtml(displayText));
            }

            updateButtonColor24();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread25 = new Runnable() {
        public void run() {
            timeInMilliseconds25 = SystemClock.uptimeMillis() - startTime25;
            updatedTime25 = timeInMilliseconds25;
            seconds25 = (int) (updatedTime25 / 1000);
            minutes25 = seconds25 / 60;
            hours25 = minutes25 / 60;
            seconds25 = seconds25 % 60;
            minutes25 = minutes25 % 60;
            sec25 =hours25 * 3600 + minutes25 * 60 + seconds25;

            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour25 * 60 * 60 + currentMinute25 * 60 + redThreshold25;
            // 计算小时和分钟
            futureHour25 = totalSeconds / 3600;
            futureMinute25 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour25 >= 24) {
                futureHour25 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour25, currentMinute25);
            String futureTimeString = String.format("%02d:%02d", futureHour25, futureMinute25);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer25.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer25.setText(Html.fromHtml(displayText));
            }

            updateButtonColor25();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread27RR = new Runnable() {
        public void run() {
            timeInMilliseconds27RR = SystemClock.uptimeMillis() - startTime27RR;
            updatedTime27RR = timeInMilliseconds27RR;
            seconds27RR = (int) (updatedTime27RR / 1000);
            minutes27RR = seconds27RR / 60;
            hours27RR = minutes27RR / 60;
            seconds27RR = seconds27RR % 60;
            minutes27RR = minutes27RR % 60;
            sec27RR =hours27RR * 3600 + minutes27RR * 60 + seconds27RR;

            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour27RR * 60 * 60 + currentMinute27RR * 60 + redThreshold27RR;
            // 计算小时和分钟
            futureHour27RR = totalSeconds / 3600;
            futureMinute27RR = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour27RR >= 24) {
                futureHour27RR %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour27RR, currentMinute27RR);
            String futureTimeString = String.format("%02d:%02d", futureHour27RR, futureMinute27RR);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer27RR.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer27RR.setText(Html.fromHtml(displayText));
            }

            updateButtonColor27RR();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread28RR = new Runnable() {
        public void run() {
            timeInMilliseconds28RR = SystemClock.uptimeMillis() - startTime28RR;
            updatedTime28RR = timeInMilliseconds28RR;
            seconds28RR = (int) (updatedTime28RR / 1000);
            minutes28RR = seconds28RR / 60;
            hours28RR = minutes28RR / 60;
            seconds28RR = seconds28RR % 60;
            minutes28RR = minutes28RR % 60;
            sec28RR =hours28RR * 3600 + minutes28RR * 60 + seconds28RR;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour28RR * 60 * 60 + currentMinute28RR * 60 + redThreshold28RR;
            // 计算小时和分钟
            futureHour28RR = totalSeconds / 3600;
            futureMinute28RR = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour28RR >= 24) {
                futureHour28RR %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour28RR, currentMinute28RR);
            String futureTimeString = String.format("%02d:%02d", futureHour28RR, futureMinute28RR);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer28RR.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer28RR.setText(Html.fromHtml(displayText));
            }

            updateButtonColor28RR();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread66 = new Runnable() {
        public void run() {
            timeInMilliseconds66 = SystemClock.uptimeMillis() - startTime66;
            updatedTime66 = timeInMilliseconds66;
            seconds66 = (int) (updatedTime66 / 1000);
            minutes66 = seconds66 / 60;
            hours66 = minutes66 / 60;
            seconds66 = seconds66 % 60;
            minutes66 = minutes66 % 60;
            sec66 =hours66 * 3600 + minutes66 * 60 + seconds66;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour66 * 60 * 60 + currentMinute66 * 60 + redThreshold66;
            // 计算小时和分钟
            futureHour66 = totalSeconds / 3600;
            futureMinute66 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour66 >= 24) {
                futureHour66 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour66, currentMinute66);
            String futureTimeString = String.format("%02d:%02d", futureHour66, futureMinute66);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer66.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer66.setText(Html.fromHtml(displayText));
            }

            updateButtonColor66();
            handler1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThread201 = new Runnable() {
        public void run() {
            timeInMilliseconds201 = SystemClock.uptimeMillis() - startTime201;
            updatedTime201 = timeInMilliseconds201;
            seconds201 = (int) (updatedTime201 / 1000);
            minutes201 = seconds201 / 60;
            hours201 = minutes201 / 60;
            seconds201 = seconds201 % 60;
            minutes201 = minutes201 % 60;
            sec201 =hours201 * 3600 + minutes201 * 60 + seconds201;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour12 * 60 * 60 + currentMinute12 * 60 + redThreshold201;
            // 计算小时和分钟
            futureHour12 = totalSeconds / 3600;
            futureMinute12 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour12 >= 24) {
                futureHour12 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour12, currentMinute12);
            String futureTimeString = String.format("%02d:%02d", futureHour12, futureMinute12);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"-----" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer201.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer201.setText(Html.fromHtml(displayText));
            }

            updateButtonColor201();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread202 = new Runnable() {
        public void run() {
            timeInMilliseconds202 = SystemClock.uptimeMillis() - startTime202;
            updatedTime202 = timeInMilliseconds202;
            seconds202 = (int) (updatedTime202 / 1000);
            minutes202 = seconds202 / 60;
            hours202 = minutes202 / 60;
            seconds202 = seconds202 % 60;
            minutes202 = minutes202 % 60;
            sec202 =hours202 * 3600 + minutes202 * 60 + seconds202;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour13 * 60 * 60 + currentMinute13 * 60 + redThreshold202;
            // 计算小时和分钟
            futureHour13 = totalSeconds / 3600;
            futureMinute13 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour13 >= 24) {
                futureHour13 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour13, currentMinute13);
            String futureTimeString = String.format("%02d:%02d", futureHour13, futureMinute13);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"-----" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer202.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer202.setText(Html.fromHtml(displayText));
            }

            updateButtonColor202();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread203 = new Runnable() {
        public void run() {
            timeInMilliseconds203 = SystemClock.uptimeMillis() - startTime203;
            updatedTime203 = timeInMilliseconds203;
            seconds203 = (int) (updatedTime203 / 1000);
            minutes203 = seconds203 / 60;
            hours203 = minutes203 / 60;
            seconds203 = seconds203 % 60;
            minutes203 = minutes203 % 60;
            sec203 =hours203 * 3600 + minutes203 * 60 + seconds203;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour14 * 60 * 60 + currentMinute14 * 60 + redThreshold203;
            // 计算小时和分钟
            futureHour14 = totalSeconds / 3600;
            futureMinute14 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour14 >= 24) {
                futureHour14 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour14, currentMinute14);
            String futureTimeString = String.format("%02d:%02d", futureHour14, futureMinute14);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"-----" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer203.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer203.setText(Html.fromHtml(displayText));
            }

            updateButtonColor203();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread204 = new Runnable() {
        public void run() {
            timeInMilliseconds204 = SystemClock.uptimeMillis() - startTime204;
            updatedTime204 = timeInMilliseconds204;
            seconds204 = (int) (updatedTime204 / 1000);
            minutes204 = seconds204 / 60;
            hours204 = minutes204 / 60;
            seconds204 = seconds204 % 60;
            minutes204 = minutes204 % 60;
            sec204 =hours204 * 3600 + minutes204 * 60 + seconds204;


            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour15 * 60 * 60 + currentMinute15 * 60 + redThreshold204;
            // 计算小时和分钟
            futureHour15 = totalSeconds / 3600;
            futureMinute15 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour15 >= 24) {
                futureHour15 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour15, currentMinute15);
            String futureTimeString = String.format("%02d:%02d", futureHour15, futureMinute15);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer204.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer204.setText(Html.fromHtml(displayText));
            }

            updateButtonColor204();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread26RR = new Runnable() {
        public void run() {
            timeInMilliseconds26RR = SystemClock.uptimeMillis() - startTime26RR;
            updatedTime26RR = timeInMilliseconds26RR;
            seconds26RR = (int) (updatedTime26RR / 1000);
            minutes26RR = seconds26RR / 60;
            hours26RR = minutes26RR / 60;
            seconds26RR = seconds26RR % 60;
            minutes26RR = minutes26RR % 60;
            sec26RR =hours26RR * 3600 + minutes26RR * 60 + seconds26RR;



            // 计算当前时间加上 redThreshold6 后的时间（秒数）
            int totalSeconds = currentHour26RR * 60 * 60 + currentMinute26RR * 60 + redThreshold26RR;
            // 计算小时和分钟
            futureHour26RR = totalSeconds / 3600;
            futureMinute26RR = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHour26RR >= 24) {
                futureHour26RR %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHour26RR, currentMinute26RR);
            String futureTimeString = String.format("%02d:%02d", futureHour26RR, futureMinute26RR);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimer26RR.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimer26RR.setText(Html.fromHtml(displayText));
            }

            updateButtonColor26RR();
            handler1.postDelayed(this, 1000);
        }
    };


    public class CustomArrayAdapter extends ArrayAdapter<String> {
        private Context context;
        private String[] options;
        private int textSize; // 字体大小字段

        public CustomArrayAdapter(Context context, String[] options, int textSize) {
            super(context, R.layout.custom_dialog_layout, options);
            this.context = context;
            this.options = options;
            this.textSize = textSize; // 设置字体大小
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.custom_dialog_layout, parent, false);

            TextView textView = rowView.findViewById(R.id.dialogTitle);
            textView.setText(options[position]);

            // 根据选项文本设置字体大小
            if (options[position].equals("30秒") || options[position].equals("60秒")) {
                textView.setTextSize(textSize); // 设置大字体大小
            } else {
                textView.setTextSize(textSize - 4); // 设置较小字体大小
            }

            return rowView;
        }
    }

    private void showTimeDialogForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("1號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime1(time1);//time1

                    if(sec1 >= blueThreshold1){
                        flashing1 = true;
                        updateButtonColor1();
                    }
                    if(flashingg1){
                        flashingg1 = false;
                        updateButtonColor1();
                    }

                    break;
                case "60分鐘":
                    addTime1(time2);//time2

                    if(sec1 >= blueThreshold1){
                        flashing1 = true;
                        updateButtonColor1();
                    }
                    if(flashingg1){
                        flashingg1 = false;
                        updateButtonColor1();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("2號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime2(time1);

                    if (sec2 >= blueThreshold2) {
                        flashing2 = true;
                        updateButtonColor2();
                    }

                    if (flashingg2) {
                        flashingg2 = false;
                        updateButtonColor2();
                    }
                    break;
                case "60分鐘":
                    addTime2(time2);
                    if (sec2 >= blueThreshold2) {
                        flashing2 = true;
                        updateButtonColor2();
                    }

                    if (flashingg2) {
                        flashingg2 = false;
                        updateButtonColor2();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("5號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime3(time1); // Customize the time for button 3


                    if (sec3 >= blueThreshold3) {
                        flashing3 = true;
                        updateButtonColor3();
                    }

                    if (flashingg3) {
                        flashingg3 = false;
                        updateButtonColor3();
                    }

                    break;
                case "60分鐘":
                    addTime3(time2); // Customize the time for button 3

                    if (sec3 >= blueThreshold3) {
                        flashing3 = true;
                        updateButtonColor3();
                    }
                    if (flashingg3) {
                        flashingg3 = false;
                        updateButtonColor3();
                    }

                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("7號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime4(time1); // Customize the time for button 4


                    if (sec4 >= blueThreshold4) {
                        flashing4 = true;
                        updateButtonColor4();
                    }
                    if (flashingg4) {
                        flashingg4 = false;
                        updateButtonColor4();
                    }
                    break;
                case "60分鐘":
                    addTime4(time2); // Customize the time for button 4


                    if (sec4 >= blueThreshold4) {
                        flashing4 = true;
                        updateButtonColor4();
                    }
                    if (flashingg4) {
                        flashingg4 = false;
                        updateButtonColor4();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("8號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime5(time1); // Customize the time for button 5



                    if (sec5 >= blueThreshold5) {
                        flashing5 = true;
                        updateButtonColor5();
                    }
                    if (flashingg5) {
                        flashingg5 = false;
                        updateButtonColor5();
                    }
                    break;
                case "60分鐘":
                    addTime5(time2); // Customize the time for button 5

                    if (sec5 >= blueThreshold5) {
                        flashing5 = true;
                        updateButtonColor5();
                    }
                    if (flashingg5) {
                        flashingg5 = false;
                        updateButtonColor5();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }



    private void showTimeDialogForButton7() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("10號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime7(time1); // Customize the time for button 7



                    if (sec7 >= blueThreshold7) {
                        flashing7 = true;
                        updateButtonColor7();
                    }
                    if (flashingg7) {
                        flashingg7 = false;
                        updateButtonColor7();
                    }
                    break;
                case "60分鐘":
                    addTime7(time2); // Customize the time for button 7

                    if (sec7 >= blueThreshold7) {
                        flashing7 = true;
                        updateButtonColor7();
                    }
                    if (flashingg7) {
                        flashingg7 = false;
                        updateButtonColor7();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton8() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("11號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime8(time1); // Customize the time for button 8


                    if (sec8 >= blueThreshold8) {
                        flashing8 = true;
                        updateButtonColor8();
                    }
                    if (flashingg8) {
                        flashingg8 = false;
                        updateButtonColor8();
                    }
                    break;
                case "60分鐘":
                    addTime8(time2); // Customize the time for button 8

                    if (sec8 >= blueThreshold8) {
                        flashing8 = true;
                        updateButtonColor8();
                    }
                    if (flashingg8) {
                        flashingg8 = false;
                        updateButtonColor8();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton9() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("12號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime9(time1); // Customize the time for button 9

                    if (sec9 >= blueThreshold9) {
                        flashing9 = true;
                        updateButtonColor9();
                    }
                    if (flashingg9) {
                        flashingg9 = false;
                        updateButtonColor9();
                    }
                    break;
                case "60分鐘":
                    addTime9(time2); // Customize the time for button 9

                    if (sec9 >= blueThreshold9) {
                        flashing9 = true;
                        updateButtonColor9();
                    }
                    if (flashingg9) {
                        flashingg9 = false;
                        updateButtonColor9();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton10() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("13號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime10(time1); // Customize the time for button 10


                    if (sec10 >= blueThreshold10) {
                        flashing10 = true;
                        updateButtonColor10();
                    }
                    if (flashingg10) {
                        flashingg10 = false;
                        updateButtonColor10();
                    }
                    break;
                case "60分鐘":
                    addTime10(time2); // Customize the time for button 10

                    if (sec10 >= blueThreshold10) {
                        flashing10 = true;
                        updateButtonColor10();
                    }
                    if (flashingg10) {
                        flashingg10 = false;
                        updateButtonColor10();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton11() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("15號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime11(time1); // Customize the time for button 11




                    if (sec11 >= blueThreshold11) {
                        flashing11 = true;
                        updateButtonColor11();
                    }
                    if (flashingg11) {
                        flashingg11 = false;
                        updateButtonColor11();
                    }
                    break;
                case "60分鐘":
                    addTime11(time2); // Customize the time for button 11


                    if (sec11 >= blueThreshold11) {
                        flashing11 = true;
                        updateButtonColor11();
                    }
                    if (flashingg11) {
                        flashingg11 = false;
                        updateButtonColor11();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton16() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("16號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime16(time1); // Customize the time for button 16

                    if (sec16 >= blueThreshold16) {
                        flashing16 = true;
                        updateButtonColor16();
                    }
                    if (flashingg16) {
                        flashingg16 = false;
                        updateButtonColor16();
                    }
                    break;
                case "60分鐘":
                    addTime16(time2); // Customize the time for button 16

                    if (sec16 >= blueThreshold16) {
                        flashing16 = true;
                        updateButtonColor16();
                    }
                    if (flashingg16) {
                        flashingg16 = false;
                        updateButtonColor16();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton17() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("17號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime17(time1); // Customize the time for button 17



                    if (sec17 >= blueThreshold17) {
                        flashing17 = true;
                        updateButtonColor17();
                    }
                    if (flashingg17) {
                        flashingg17 = false;
                        updateButtonColor17();
                    }

                    break;
                case "60分鐘":
                    addTime17(time2); // Customize the time for button 17

                    if (sec17 >= blueThreshold17) {
                        flashing17 = true;
                        updateButtonColor17();
                    }
                    if (flashingg17) {
                        flashingg17 = false;
                        updateButtonColor17();
                    }

                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton18() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("18號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime18(time1); // Customize the time for button 18


                    if (sec18 >= blueThreshold18) {
                        flashing18 = true;
                        updateButtonColor18();
                    }
                    if (flashingg18) {
                        flashingg18 = false;
                        updateButtonColor18();
                    }
                    break;
                case "60分鐘":
                    addTime18(time2); // Customize the time for button 18

                    if (sec18 >= blueThreshold18) {
                        flashing18 = true;
                        updateButtonColor18();
                    }
                    if (flashingg18) {
                        flashingg18 = false;
                        updateButtonColor18();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton19() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("19號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime19(time1); // Customize the time for button 19


                    if (sec19 >= blueThreshold19) {
                        flashing19 = true;
                        updateButtonColor19();
                    }
                    if (flashingg19) {
                        flashingg19 = false;
                        updateButtonColor19();
                    }
                    break;
                case "60分鐘":
                    addTime19(time2); // Customize the time for button 19

                    if (sec19 >= blueThreshold19) {
                        flashing19 = true;
                        updateButtonColor19();
                    }
                    if (flashingg19) {
                        flashingg19 = false;
                        updateButtonColor19();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton20() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("20號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime20(time1); // Customize the time for button 20


                    if (sec20 >= blueThreshold20) {
                        flashing20 = true;
                        updateButtonColor20();
                    }
                    if (flashingg20) {
                        flashingg20 = false;
                        updateButtonColor20();
                    }
                    break;
                case "60分鐘":
                    addTime20(time2); // Customize the time for button 20

                    if (sec20 >= blueThreshold20) {
                        flashing20 = true;
                        updateButtonColor20();
                    }
                    if (flashingg20) {
                        flashingg20 = false;
                        updateButtonColor20();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton21() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("21號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime21(time1); // Customize the time for button 21



                    if (sec21 >= blueThreshold21) {
                        flashing21 = true;
                        updateButtonColor21();
                    }
                    if (flashingg21) {
                        flashingg21 = false;
                        updateButtonColor21();
                    }
                    break;
                case "60分鐘":
                    addTime21(time2); // Customize the time for button 21

                    if (sec21 >= blueThreshold21) {
                        flashing21 = true;
                        updateButtonColor21();
                    }
                    if (flashingg21) {
                        flashingg21 = false;
                        updateButtonColor21();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton22() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("22號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime22(time1); // Customize the time for button 22

                    if (sec22 >= blueThreshold22) {
                        flashing22 = true;
                        updateButtonColor22();
                    }
                    if (flashingg22) {
                        flashingg22 = false;
                        updateButtonColor22();
                    }
                    break;
                case "60分鐘":
                    addTime22(time2); // Customize the time for button 22

                    if (sec22 >= blueThreshold22) {
                        flashing22 = true;
                        updateButtonColor22();
                    }
                    if (flashingg22) {
                        flashingg22 = false;
                        updateButtonColor22();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton23() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("23號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime23(time1); // Customize the time for button 23


                    if (sec23 >= blueThreshold23) {
                        flashing23 = true;
                        updateButtonColor23();
                    }
                    if (flashingg23) {
                        flashingg23 = false;
                        updateButtonColor23();
                    }
                    break;
                case "60分鐘":
                    addTime23(time2); // Customize the time for button 23

                    if (sec23 >= blueThreshold23) {
                        flashing23 = true;
                        updateButtonColor23();
                    }
                    if (flashingg23) {
                        flashingg23 = false;
                        updateButtonColor23();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton24() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("25號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime24(time1); // Customize the time for button 24

                    if (sec24 >= blueThreshold24) {
                        flashing24 = true;
                        updateButtonColor24();
                    }
                    if (flashingg24) {
                        flashingg24 = false;
                        updateButtonColor24();
                    }
                    break;
                case "60分鐘":
                    addTime24(time2); // Customize the time for button 24

                    if (sec24 >= blueThreshold24) {
                        flashing24 = true;
                        updateButtonColor24();
                    }
                    if (flashingg24) {
                        flashingg24 = false;
                        updateButtonColor24();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton25() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("26號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime25(time1); // Customize the time for button 25



                    if (sec25 >= blueThreshold25) {
                        flashing25 = true;
                        updateButtonColor25();
                    }
                    if (flashingg25) {
                        flashingg25 = false;
                        updateButtonColor25();
                    }
                    break;
                case "60分鐘":
                    addTime25(time2); // Customize the time for button 25

                    if (sec25 >= blueThreshold25) {
                        flashing25 = true;
                        updateButtonColor25();
                    }
                    if (flashingg25) {
                        flashingg25 = false;
                        updateButtonColor25();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }


    private void showTimeDialogForButton27RR() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("28號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime27RR(time1); // Customize the time for button 27RR



                    if (sec27RR >= blueThreshold27RR) {
                        flashing27RR = true;
                        updateButtonColor27RR();
                    }
                    if (flashingg27RR) {
                        flashingg27RR = false;
                        updateButtonColor27RR();
                    }
                    break;
                case "60分鐘":
                    addTime27RR(time2); // Customize the time for button 27RR

                    if (sec27RR >= blueThreshold27RR) {
                        flashing27RR = true;
                        updateButtonColor27RR();
                    }
                    if (flashingg27RR) {
                        flashingg27RR = false;
                        updateButtonColor27RR();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton28RR() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("29號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime28RR(time1); // Customize the time for button 28RR

                    if (sec28RR >= blueThreshold28RR) {
                        flashing28RR = true;
                        updateButtonColor28RR();
                    }

                    if (flashingg28RR) {
                        flashingg28RR = false;
                        updateButtonColor28RR();
                    }
                    break;
                case "60分鐘":
                    addTime28RR(time2); // Customize the time for button 28RR

                    if (sec28RR >= blueThreshold28RR) {
                        flashing28RR = true;
                        updateButtonColor28RR();
                    }
                    if (flashingg28RR) {
                        flashingg28RR = false;
                        updateButtonColor28RR();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton66() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("9號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime66(time1); // Customize the time for button 66

                    if (sec66 >= blueThreshold66) {
                        flashing66 = true;
                        updateButtonColor66();
                    }

                    if (flashingg66) {
                        flashingg66 = false;
                        updateButtonColor66();
                    }
                    break;
                case "60分鐘":
                    addTime66(time2); // Customize the time for button 66

                    if (sec66 >= blueThreshold66) {
                        flashing66 = true;
                        updateButtonColor66();
                    }
                    if (flashingg66) {
                    flashingg66 = false;
                    updateButtonColor66();
                }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton201() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("201號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime201(time1); // Customize the time for button 28


                    if (sec201 >= blueThreshold201) {
                        flashing201 = true;
                        updateButtonColor201();
                    }
                    if (flashingg201) {
                        flashingg201 = false;
                        updateButtonColor201();
                    }
                    break;
                case "60分鐘":
                    addTime201(time2); // Customize the time for button 28

                    if (sec201 >= blueThreshold201) {
                        flashing201 = true;
                        updateButtonColor201();
                    }
                    if (flashingg201) {
                        flashingg201 = false;
                        updateButtonColor201();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton202() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("202號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime202(time1); // Customize the time for button 28



                    if (sec202 >= blueThreshold202) {
                        flashing202 = true;
                        updateButtonColor202();
                    }
                    if (flashingg202) {
                        flashingg202 = false;
                        updateButtonColor202();
                    }
                    break;
                case "60分鐘":
                    addTime202(time2); // Customize the time for button 28

                    if (sec202 >= blueThreshold202) {
                        flashing202 = true;
                        updateButtonColor202();
                    }
                    if (flashingg202) {
                        flashingg202 = false;
                        updateButtonColor202();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton203() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("203號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime203(time1); // Customize the time for button 28




                    if (sec203 >= blueThreshold203) {
                        flashing203 = true;
                        updateButtonColor203();
                    }
                    if (flashingg203) {
                        flashingg203 = false;
                        updateButtonColor203();
                    }
                    break;
                case "60分鐘":
                    addTime203(time2); // Customize the time for button 28

                    if (sec203 >= blueThreshold203) {
                        flashing203 = true;
                        updateButtonColor203();
                    }
                    if (flashingg203) {
                        flashingg203 = false;
                        updateButtonColor203();
                    }

                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton204() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("205號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime204(time1); // Customize the time for button 28



                    if (sec204 >= blueThreshold204) {
                        flashing204 = true;
                        updateButtonColor204();
                    }
                    if (flashingg204) {
                        flashingg204 = false;
                        updateButtonColor204();
                    }
                    break;
                case "60分鐘":
                    addTime204(time2); // Customize the time for button 28

                    if (sec204 >= blueThreshold204) {
                        flashing204 = true;
                        updateButtonColor204();
                    }
                    if (flashingg204) {
                        flashingg204 = false;
                        updateButtonColor204();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton26RR() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("27號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime26RR(time1); // Customize the time for button 26RR



                    if (sec26RR >= blueThreshold26RR) {
                        flashing26RR = true;
                        updateButtonColor26RR();
                    }
                    if (flashingg26RR) {
                        flashingg26RR = false;
                        updateButtonColor26RR();
                    }
                    break;
                case "60分鐘":
                    addTime26RR(time2); // Customize the time for button 26RR

                    if (sec26RR >= blueThreshold26RR) {
                        flashing26RR = true;
                        updateButtonColor26RR();
                    }
                    if (flashingg26RR) {
                        flashingg26RR = false;
                        updateButtonColor26RR();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void addTime1(int secondsToAdd) {
        //blueThreshold1 += secondsToAdd;
        yellowThreshold1 += secondsToAdd;
        redThreshold1 += secondsToAdd;
        updateButtonColor1();
    }
    private void addTime2(int secondsToAdd) {
        //blueThreshold2 += secondsToAdd;
        yellowThreshold2 += secondsToAdd;
        redThreshold2 += secondsToAdd;

        updateButtonColor2();
    }

    private void addTime3(int secondsToAdd) {
        //blueThreshold3 += secondsToAdd; // Customize for button 3
        yellowThreshold3 += secondsToAdd; // Customize for button 3
        redThreshold3 += secondsToAdd; // Customize for button 3

        updateButtonColor3();
    }

    private void addTime4(int secondsToAdd) {
        //blueThreshold4 += secondsToAdd; // Customize for button 4
        yellowThreshold4 += secondsToAdd; // Customize for button 4
        redThreshold4 += secondsToAdd; // Customize for button 4

        updateButtonColor4();
    }
    private void addTime5(int secondsToAdd) {
        //blueThreshold5 += secondsToAdd; // Customize for button 5
        yellowThreshold5 += secondsToAdd; // Customize for button 5
        redThreshold5 += secondsToAdd; // Customize for button 5

        updateButtonColor5();
    }

    private void addTime7(int secondsToAdd) {
        //blueThreshold7 += secondsToAdd; // Customize for button 7
        yellowThreshold7 += secondsToAdd; // Customize for button 7
        redThreshold7 += secondsToAdd; // Customize for button 7

        updateButtonColor7();
    }

    private void addTime8(int secondsToAdd) {
        //blueThreshold8 += secondsToAdd; // Customize for button 8
        yellowThreshold8 += secondsToAdd; // Customize for button 8
        redThreshold8 += secondsToAdd; // Customize for button 8

        updateButtonColor8();
    }

    private void addTime9(int secondsToAdd) {
        //blueThreshold9 += secondsToAdd; // Customize for button 9
        yellowThreshold9 += secondsToAdd; // Customize for button 9
        redThreshold9 += secondsToAdd; // Customize for button 9

        updateButtonColor9();
    }

    private void addTime10(int secondsToAdd) {
        //blueThreshold10 += secondsToAdd; // Customize for button 10
        yellowThreshold10 += secondsToAdd; // Customize for button 10
        redThreshold10 += secondsToAdd; // Customize for button 10

        updateButtonColor10();
    }

    private void addTime11(int secondsToAdd) {
        //blueThreshold11 += secondsToAdd; // Customize for button 11
        yellowThreshold11 += secondsToAdd; // Customize for button 11
        redThreshold11 += secondsToAdd; // Customize for button 11

        updateButtonColor11();
    }
    private void addTime16(int secondsToAdd) {
        //blueThreshold16 += secondsToAdd; // Customize for button 16
        yellowThreshold16 += secondsToAdd; // Customize for button 16
        redThreshold16 += secondsToAdd; // Customize for button 16

        updateButtonColor16();
    }

    private void addTime17(int secondsToAdd) {
        //blueThreshold17 += secondsToAdd; // Customize for button 17
        yellowThreshold17 += secondsToAdd; // Customize for button 17
        redThreshold17 += secondsToAdd; // Customize for button 17

        updateButtonColor17();
    }

    private void addTime18(int secondsToAdd) {
        //blueThreshold18 += secondsToAdd; // Customize for button 18
        yellowThreshold18 += secondsToAdd; // Customize for button 18
        redThreshold18 += secondsToAdd; // Customize for button 18

        updateButtonColor18();

    }

    private void addTime19(int secondsToAdd) {
        //blueThreshold19 += secondsToAdd; // Customize for button 19
        yellowThreshold19 += secondsToAdd; // Customize for button 19
        redThreshold19 += secondsToAdd; // Customize for button 19

        updateButtonColor19();

    }

    private void addTime20(int secondsToAdd) {
        //blueThreshold20 += secondsToAdd; // Customize for button 20
        yellowThreshold20 += secondsToAdd; // Customize for button 20
        redThreshold20 += secondsToAdd; // Customize for button 20

        updateButtonColor20();
    }

    private void addTime21(int secondsToAdd) {
        //blueThreshold21 += secondsToAdd; // Customize for button 21
        yellowThreshold21 += secondsToAdd; // Customize for button 21
        redThreshold21 += secondsToAdd; // Customize for button 21


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor21();
    }

    private void addTime22(int secondsToAdd) {
        //blueThreshold22 += secondsToAdd; // Customize for button 22
        yellowThreshold22 += secondsToAdd; // Customize for button 22
        redThreshold22 += secondsToAdd; // Customize for button 22


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor22();
    }

    private void addTime23(int secondsToAdd) {
        //blueThreshold23 += secondsToAdd; // Customize for button 23
        yellowThreshold23 += secondsToAdd; // Customize for button 23
        redThreshold23 += secondsToAdd; // Customize for button 23


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor23();
    }

    private void addTime24(int secondsToAdd) {
        //blueThreshold24 += secondsToAdd; // Customize for button 24
        yellowThreshold24 += secondsToAdd; // Customize for button 24
        redThreshold24 += secondsToAdd; // Customize for button 24


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor24();
    }

    private void addTime25(int secondsToAdd) {
        //blueThreshold25 += secondsToAdd; // Customize for button 25
        yellowThreshold25 += secondsToAdd; // Customize for button 25
        redThreshold25 += secondsToAdd; // Customize for button 25


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor25();
    }
/*
    private void addTime266(int secondsToAdd) {
        //blueThreshold266 += secondsToAdd; // Customize for button 266
        yellowThreshold266 += secondsToAdd; // Customize for button 266
        redThreshold266 += secondsToAdd; // Customize for button 266


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor266();
    }
*/
    private void addTime27RR(int secondsToAdd) {
        //blueThreshold27 += secondsToAdd; // Customize for button 27RR
        yellowThreshold27RR += secondsToAdd; // Customize for button 27RR
        redThreshold27RR += secondsToAdd; // Customize for button 27RR


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor27RR();
    }

    private void addTime28RR(int secondsToAdd) {
        //blueThreshold28 += secondsToAdd; // Customize for button 28
        yellowThreshold28RR += secondsToAdd; // Customize for button 28
        redThreshold28RR += secondsToAdd; // Customize for button 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor28RR();
    }
    private void addTime66(int secondsToAdd) {
        //blueThreshold66 += secondsToAdd; // Customize for button 66
        yellowThreshold66 += secondsToAdd; // Customize for button 66
        redThreshold66 += secondsToAdd; // Customize for button 66


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor66();
    }
    private void addTime201(int secondsToAdd) {
        //blueThreshold201 += secondsToAdd; // Customize for button 28
        yellowThreshold201 += secondsToAdd; // Customize for button 28
        redThreshold201 += secondsToAdd; // Customize for button 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor201();
    }
    private void addTime202(int secondsToAdd) {
        //blueThreshold202 += secondsToAdd; // Customize for button 28
        yellowThreshold202 += secondsToAdd; // Customize for button 28
        redThreshold202 += secondsToAdd; // Customize for button 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor202();
    }
    private void addTime203(int secondsToAdd) {
        //blueThreshold203 += secondsToAdd; // Customize for button 28
        yellowThreshold203 += secondsToAdd; // Customize for button 28
        redThreshold203 += secondsToAdd; // Customize for button 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor203();
    }
    private void addTime204(int secondsToAdd) {
        //blueThreshold204 += secondsToAdd; // Customize for button 28
        yellowThreshold204 += secondsToAdd; // Customize for button 28
        redThreshold204 += secondsToAdd; // Customize for button 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor204();
    }

    private void addTime26RR(int secondsToAdd) {
        //blueThreshold26RR += secondsToAdd; // Customize for button 26RR
        yellowThreshold26RR += secondsToAdd; // Customize for button 26RR
        redThreshold26RR += secondsToAdd; // Customize for button 26RR

        updateButtonColor26RR();
    }


    //--------------------------------------------------------------------------

//--------------------------------------------------------------------------


    private void updateButtonColor1() {
        if (sec1 < 0.01) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec1 < blueThreshold1 && people2_1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec1 < blueThreshold1 && !people2_1 ) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec1 < yellowThreshold1 && people2_1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashing1 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer1.startAnimation(blinkAnimation);
            }else{
                btnTimer1.clearAnimation();
            }
        } else if (sec1 < yellowThreshold1 && !people2_1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec1 < redThreshold1) {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashingg1 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer1.startAnimation(blinkAnimation);
            }else{
                btnTimer1.clearAnimation();
            }
        } else {
            btnTimer1.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer1.clearAnimation();
        }
    }
    private void updateButtonColor2() {
        if (sec2 < 0.01) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec2 < blueThreshold2 && people2_2) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec2 < blueThreshold2 && !people2_2 ) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec2 < yellowThreshold2 && people2_2) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashing2 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer2.startAnimation(blinkAnimation);
            }else{
                btnTimer2.clearAnimation();
            }
        } else if (sec2 < yellowThreshold2 && !people2_2) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec2 < redThreshold2) {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashingg2 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer2.startAnimation(blinkAnimation);
            }else{
                btnTimer2.clearAnimation();
            }
        } else {
            btnTimer2.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer2.clearAnimation();
        }
    }

    private void updateButtonColor3() {
        if (sec3 < 0.01) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec3 < blueThreshold3 && people2_3) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec3 < blueThreshold3 && !people2_3 ) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec3 < yellowThreshold3 && people2_3) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing3 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer3.startAnimation(blinkAnimation);
            }else{
                btnTimer3.clearAnimation();
            }


        } else if (sec3 < yellowThreshold3 && !people2_3) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec3 < redThreshold3) {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg3 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer3.startAnimation(blinkAnimation);
            }else{
                btnTimer3.clearAnimation();
            }


        } else {
            btnTimer3.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer3.clearAnimation();
        }
    }

    private void updateButtonColor4() {
        if (sec4 < 0.01) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec4 < blueThreshold4 && people2_4) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec4 < blueThreshold4 && !people2_4 ) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec4 < yellowThreshold4 && people2_4) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing4 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer4.startAnimation(blinkAnimation);
            }else{
                btnTimer4.clearAnimation();
            }


        } else if (sec4 < yellowThreshold4 && !people2_4) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec4 < redThreshold4) {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg4 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer4.startAnimation(blinkAnimation);
            }else{
                btnTimer4.clearAnimation();
            }


        } else {
            btnTimer4.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer4.clearAnimation();
        }
    }
    private void updateButtonColor5() {
        if (sec5 < 0.01) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec5 < blueThreshold5 && people2_5) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec5 < blueThreshold5 && !people2_5 ) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec5 < yellowThreshold5 && people2_5) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing5 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer5.startAnimation(blinkAnimation);
            }else{
                btnTimer5.clearAnimation();
            }


        } else if (sec5 < yellowThreshold5 && !people2_5) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec5 < redThreshold5) {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg5 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer5.startAnimation(blinkAnimation);
            }else{
                btnTimer5.clearAnimation();
            }


        } else {
            btnTimer5.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer5.clearAnimation();
        }
    }



    private void updateButtonColor7() {
        if (sec7 < 0.01) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec7 < blueThreshold7 && people2_7) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec7 < blueThreshold7 && !people2_7 ) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec7 < yellowThreshold7 && people2_7) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing7 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer7.startAnimation(blinkAnimation);
            }else{
                btnTimer7.clearAnimation();
            }


        } else if (sec7 < yellowThreshold7 && !people2_7) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec7 < redThreshold7) {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg7 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer7.startAnimation(blinkAnimation);
            }else{
                btnTimer7.clearAnimation();
            }


        } else {
            btnTimer7.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer7.clearAnimation();
        }
    }

    private void updateButtonColor8() {
        if (sec8 < 0.01) {
            btnTimer8.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec8 < blueThreshold8 && people2_8) {
            btnTimer8.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec8 < blueThreshold8 && !people2_8 ) {
            btnTimer8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec8 < yellowThreshold8 && people2_8) {
            btnTimer8.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing8 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer8.startAnimation(blinkAnimation);
            }else{
                btnTimer8.clearAnimation();
            }
        } else if (sec8 < yellowThreshold8 && !people2_8) {
            btnTimer8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec8 < redThreshold8) {
            btnTimer8.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg8 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer8.startAnimation(blinkAnimation);
            }else{
                btnTimer8.clearAnimation();
            }
        } else {
            btnTimer8.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer8.clearAnimation();
        }
    }

    private void updateButtonColor9() {
        if (sec9 < 0.01) {
            btnTimer9.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec9 < blueThreshold9 && people2_9) {
            btnTimer9.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec9 < blueThreshold9 && !people2_9 ) {
            btnTimer9.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec9 < yellowThreshold9 && people2_9) {
            btnTimer9.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing9 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer9.startAnimation(blinkAnimation);
            }else{
                btnTimer9.clearAnimation();
            }


        } else if (sec9 < yellowThreshold9 && !people2_9) {
            btnTimer9.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec9 < redThreshold9) {
            btnTimer9.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg9 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer9.startAnimation(blinkAnimation);
            }else{
                btnTimer9.clearAnimation();
            }


        } else {
            btnTimer9.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer9.clearAnimation();
        }
    }

    private void updateButtonColor10() {
        if (sec10 < 0.01) {
            btnTimer10.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec10 < blueThreshold10 && people2_10) {
            btnTimer10.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec10 < blueThreshold10 && !people2_10 ) {
            btnTimer10.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec10 < yellowThreshold10 && people2_10) {
            btnTimer10.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing10 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer10.startAnimation(blinkAnimation);
            }else{
                btnTimer10.clearAnimation();
            }


        } else if (sec10 < yellowThreshold10 && !people2_10) {
            btnTimer10.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec10 < redThreshold10) {
            btnTimer10.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg10 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer10.startAnimation(blinkAnimation);
            }else{
                btnTimer10.clearAnimation();
            }


        } else {
            btnTimer10.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer10.clearAnimation();
        }
    }

    private void updateButtonColor11() {
        if (sec11 < 0.01) {
            btnTimer11.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec11 < blueThreshold11 && people2_11) {
            btnTimer11.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec11 < blueThreshold11 && !people2_11 ) {
            btnTimer11.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec11 < yellowThreshold11 && people2_11) {
            btnTimer11.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing11 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer11.startAnimation(blinkAnimation);
            }else{
                btnTimer11.clearAnimation();
            }


        } else if (sec11 < yellowThreshold11 && !people2_11) {
            btnTimer11.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec11 < redThreshold11) {
            btnTimer11.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg11 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer11.startAnimation(blinkAnimation);
            }else{
                btnTimer11.clearAnimation();
            }


        } else {
            btnTimer11.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer11.clearAnimation();
        }
    }

    private void updateButtonColor16() {
        if (sec16 < 0.01) {
            btnTimer16.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec16 < blueThreshold16 && people2_16) {
            btnTimer16.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec16 < blueThreshold16 && !people2_16 ) {
            btnTimer16.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec16 < yellowThreshold16 && people2_16) {
            btnTimer16.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing16 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer16.startAnimation(blinkAnimation);
            }else{
                btnTimer16.clearAnimation();
            }


        } else if (sec16 < yellowThreshold16 && !people2_16) {
            btnTimer16.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec16 < redThreshold16) {
            btnTimer16.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg16 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer16.startAnimation(blinkAnimation);
            }else{
                btnTimer16.clearAnimation();
            }


        } else {
            btnTimer16.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer16.clearAnimation();
        }
    }

    private void updateButtonColor17() {
        if (sec17 < 0.01) {
            btnTimer17.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec17 < blueThreshold17 && people2_17) {
            btnTimer17.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec17 < blueThreshold17 && !people2_17 ) {
            btnTimer17.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec17 < yellowThreshold17 && people2_17) {
            btnTimer17.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing17 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer17.startAnimation(blinkAnimation);
            }else{
                btnTimer17.clearAnimation();
            }


        } else if (sec17 < yellowThreshold17 && !people2_17) {
            btnTimer17.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec17 < redThreshold17) {
            btnTimer17.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg17 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer17.startAnimation(blinkAnimation);
            }else{
                btnTimer17.clearAnimation();
            }


        } else {
            btnTimer17.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer17.clearAnimation();
        }
    }

    private void updateButtonColor18() {
        if (sec18 < 0.01) {
            btnTimer18.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec18 < blueThreshold18 && people2_18) {
            btnTimer18.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec18 < blueThreshold18 && !people2_18 ) {
            btnTimer18.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec18 < yellowThreshold18 && people2_18) {
            btnTimer18.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing18 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer18.startAnimation(blinkAnimation);
            }else{
                btnTimer18.clearAnimation();
            }


        } else if (sec18 < yellowThreshold18 && !people2_18) {
            btnTimer18.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec18 < redThreshold18) {
            btnTimer18.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg18 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer18.startAnimation(blinkAnimation);
            }else{
                btnTimer18.clearAnimation();
            }


        } else {
            btnTimer18.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer18.clearAnimation();
        }
    }

    private void updateButtonColor19() {
        if (sec19 < 0.01) {
            btnTimer19.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec19 < blueThreshold19 && people2_19) {
            btnTimer19.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec19 < blueThreshold19 && !people2_19 ) {
            btnTimer19.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec19 < yellowThreshold19 && people2_19) {
            btnTimer19.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing19 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer19.startAnimation(blinkAnimation);
            }else{
                btnTimer19.clearAnimation();
            }


        } else if (sec19 < yellowThreshold19 && !people2_19) {
            btnTimer19.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec19 < redThreshold19) {
            btnTimer19.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg19 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer19.startAnimation(blinkAnimation);
            }else{
                btnTimer19.clearAnimation();
            }


        } else {
            btnTimer19.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer19.clearAnimation();
        }
    }

    private void updateButtonColor20() {
        if (sec20 < 0.01) {
            btnTimer20.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec20 < blueThreshold20 && people2_20) {
            btnTimer20.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec20 < blueThreshold20 && !people2_20 ) {
            btnTimer20.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec20 < yellowThreshold20 && people2_20) {
            btnTimer20.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing20 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer20.startAnimation(blinkAnimation);
            }else{
                btnTimer20.clearAnimation();
            }


        } else if (sec20 < yellowThreshold20 && !people2_20) {
            btnTimer20.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec20 < redThreshold20) {
            btnTimer20.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg20 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer20.startAnimation(blinkAnimation);
            }else{
                btnTimer20.clearAnimation();
            }


        } else {
            btnTimer20.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer20.clearAnimation();
        }
    }

    private void updateButtonColor21() {
        if (sec21 < 0.01) {
            btnTimer21.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec21 < blueThreshold21 && people2_21) {
            btnTimer21.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec21 < blueThreshold21 && !people2_21 ) {
            btnTimer21.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec21 < yellowThreshold21 && people2_21) {
            btnTimer21.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing21 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer21.startAnimation(blinkAnimation);
            }else{
                btnTimer21.clearAnimation();
            }


        } else if (sec21 < yellowThreshold21 && !people2_21) {
            btnTimer21.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec21 < redThreshold21) {
            btnTimer21.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg21 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer21.startAnimation(blinkAnimation);
            }else{
                btnTimer21.clearAnimation();
            }


        } else {
            btnTimer21.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer21.clearAnimation();
        }
    }

    private void updateButtonColor22() {
        if (sec22 < 0.01) {
            btnTimer22.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec22 < blueThreshold22 && people2_22) {
            btnTimer22.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec22 < blueThreshold22 && !people2_22 ) {
            btnTimer22.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec22 < yellowThreshold22 && people2_22) {
            btnTimer22.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing22 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer22.startAnimation(blinkAnimation);
            }else{
                btnTimer22.clearAnimation();
            }


        } else if (sec22 < yellowThreshold22 && !people2_22) {
            btnTimer22.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec22 < redThreshold22) {
            btnTimer22.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg22 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer22.startAnimation(blinkAnimation);
            }else{
                btnTimer22.clearAnimation();
            }


        } else {
            btnTimer22.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer22.clearAnimation();
        }
    }

    private void updateButtonColor23() {
        if (sec23 < 0.01) {
            btnTimer23.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec23 < blueThreshold23 && people2_23) {
            btnTimer23.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec23 < blueThreshold23 && !people2_23 ) {
            btnTimer23.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec23 < yellowThreshold23 && people2_23) {
            btnTimer23.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing23 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer23.startAnimation(blinkAnimation);
            }else{
                btnTimer23.clearAnimation();
            }


        } else if (sec23 < yellowThreshold23 && !people2_23) {
            btnTimer23.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec23 < redThreshold23) {
            btnTimer23.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg23 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer23.startAnimation(blinkAnimation);
            }else{
                btnTimer23.clearAnimation();
            }


        } else {
            btnTimer23.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer23.clearAnimation();
        }
    }

    private void updateButtonColor24() {
        if (sec24 < 0.01) {
            btnTimer24.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec24 < blueThreshold24 && people2_24) {
            btnTimer24.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec24 < blueThreshold24 && !people2_24 ) {
            btnTimer24.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec24 < yellowThreshold24 && people2_24) {
            btnTimer24.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing24 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer24.startAnimation(blinkAnimation);
            }else{
                btnTimer24.clearAnimation();
            }


        } else if (sec24 < yellowThreshold24 && !people2_24) {
            btnTimer24.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec24 < redThreshold24) {
            btnTimer24.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg24 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer24.startAnimation(blinkAnimation);
            }else{
                btnTimer24.clearAnimation();
            }


        } else {
            btnTimer24.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer24.clearAnimation();
        }
    }

    private void updateButtonColor25() {
        if (sec25 < 0.01) {
            btnTimer25.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec25 < blueThreshold25 && people2_25) {
            btnTimer25.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec25 < blueThreshold25 && !people2_25 ) {
            btnTimer25.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec25 < yellowThreshold25 && people2_25) {
            btnTimer25.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing25 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer25.startAnimation(blinkAnimation);
            }else{
                btnTimer25.clearAnimation();
            }


        } else if (sec25 < yellowThreshold25 && !people2_25) {
            btnTimer25.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec25 < redThreshold25) {
            btnTimer25.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg25 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer25.startAnimation(blinkAnimation);
            }else{
                btnTimer25.clearAnimation();
            }


        } else {
            btnTimer25.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer25.clearAnimation();
        }
    }

    private void updateButtonColor27RR() {
        if (sec27RR < 0.01) {
            btnTimer27RR.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec27RR < blueThreshold27RR && people2_27RR) {
            btnTimer27RR.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec27RR < blueThreshold27RR && !people2_27RR ) {
            btnTimer27RR.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec27RR < yellowThreshold27RR && people2_27RR) {
            btnTimer27RR.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing27RR ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer27RR.startAnimation(blinkAnimation);
            }else{
                btnTimer27RR.clearAnimation();
            }


        } else if (sec27RR < yellowThreshold27RR && !people2_27RR) {
            btnTimer27RR.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec27RR < redThreshold27RR) {
            btnTimer27RR.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg27RR ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer27RR.startAnimation(blinkAnimation);
            }else{
                btnTimer27RR.clearAnimation();
            }


        } else {
            btnTimer27RR.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer27RR.clearAnimation();
        }
    }

    private void updateButtonColor28RR() {
        if (sec28RR < 0.01) {
            btnTimer28RR.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec28RR < blueThreshold28RR && people2_28RR) {
            btnTimer28RR.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec28RR < blueThreshold28RR && !people2_28RR ) {
            btnTimer28RR.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec28RR < yellowThreshold28RR && people2_28RR) {
            btnTimer28RR.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing28RR ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer28RR.startAnimation(blinkAnimation);
            }else{
                btnTimer28RR.clearAnimation();
            }


        } else if (sec28RR < yellowThreshold28RR && !people2_28RR) {
            btnTimer28RR.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec28RR < redThreshold28RR) {
            btnTimer28RR.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg28RR ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer28RR.startAnimation(blinkAnimation);
            }else{
                btnTimer28RR.clearAnimation();
            }


        } else {
            btnTimer28RR.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer28RR.clearAnimation();
        }
    }
    private void updateButtonColor66() {
        if (sec66 < 0.01) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec66 < blueThreshold66 && people2_66) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec66 < blueThreshold66 && !people2_66 ) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec66 < yellowThreshold66 && people2_66) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing66 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer66.startAnimation(blinkAnimation);
            }else{
                btnTimer66.clearAnimation();
            }


        } else if (sec66 < yellowThreshold66 && !people2_66) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec66 < redThreshold66) {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg66 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer66.startAnimation(blinkAnimation);
            }else{
                btnTimer66.clearAnimation();
            }


        } else {
            btnTimer66.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer66.clearAnimation();
        }
    }

    private void updateButtonColor201() {
        if (sec201 < 0.01) {
            btnTimer201.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec201 < blueThreshold201 && people2_12) {
            btnTimer201.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec201 < blueThreshold201 && !people2_12 ) {
            btnTimer201.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec201 < yellowThreshold201 && people2_12) {
            btnTimer201.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing201 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer201.startAnimation(blinkAnimation);
            }else{
                btnTimer201.clearAnimation();
            }


        } else if (sec201 < yellowThreshold201 && !people2_12) {
            btnTimer201.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec201 < redThreshold201) {
            btnTimer201.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg201 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer201.startAnimation(blinkAnimation);
            }else{
                btnTimer201.clearAnimation();
            }


        } else {
            btnTimer201.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer201.clearAnimation();
        }
    }

    private void updateButtonColor202() {
        if (sec202 < 0.01) {
            btnTimer202.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec202 < blueThreshold202 && people2_13) {
            btnTimer202.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec202 < blueThreshold202 && !people2_13 ) {
            btnTimer202.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec202 < yellowThreshold202 && people2_13) {
            btnTimer202.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing202 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer202.startAnimation(blinkAnimation);
            }else{
                btnTimer202.clearAnimation();
            }
        } else if (sec202 < yellowThreshold202 && !people2_13) {
            btnTimer202.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec202 < redThreshold202) {
            btnTimer202.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg202 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer202.startAnimation(blinkAnimation);
            }else{
                btnTimer202.clearAnimation();
            }

        } else {
            btnTimer202.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer202.clearAnimation();
        }
    }
    private void updateButtonColor203() {
        if (sec203 < 0.01) {
            btnTimer203.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec203 < blueThreshold203 && people2_14) {
            btnTimer203.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec203 < blueThreshold203 && !people2_14 ) {
            btnTimer203.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec203 < yellowThreshold203 && people2_14) {
            btnTimer203.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing203 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer203.startAnimation(blinkAnimation);
            }else{
                btnTimer203.clearAnimation();
            }


        } else if (sec203 < yellowThreshold203 && !people2_14) {
            btnTimer203.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec203 < redThreshold203) {
            btnTimer203.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg203 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer203.startAnimation(blinkAnimation);
            }else{
                btnTimer203.clearAnimation();
            }


        } else {
            btnTimer203.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer203.clearAnimation();
        }
    }
    private void updateButtonColor204() {
        if (sec204 < 0.01) {
            btnTimer204.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec204 < blueThreshold204 && people2_15) {
            btnTimer204.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec204 < blueThreshold204 && !people2_15 ) {
            btnTimer204.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec204 < yellowThreshold204 && people2_15) {
            btnTimer204.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing204 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer204.startAnimation(blinkAnimation);
            }else{
                btnTimer204.clearAnimation();
            }


        } else if (sec204 < yellowThreshold204 && !people2_15) {
            btnTimer204.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec204 < redThreshold204) {
            btnTimer204.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg204 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer204.startAnimation(blinkAnimation);
            }else{
                btnTimer204.clearAnimation();
            }

        } else {
            btnTimer204.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer204.clearAnimation();
        }
    }

    private void updateButtonColor26RR() {
        if (sec26RR < 0.01) {
            btnTimer26RR.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sec26RR < blueThreshold26RR && people2_26RR) {
            btnTimer26RR.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sec26RR < blueThreshold26RR && !people2_26RR ) {
            btnTimer26RR.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec26RR < yellowThreshold26RR && people2_26RR) {
            btnTimer26RR.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashing26RR ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer26RR.startAnimation(blinkAnimation);
            }else{
                btnTimer26RR.clearAnimation();
            }


        } else if (sec26RR < yellowThreshold26RR && !people2_26RR) {
            btnTimer26RR.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sec26RR < redThreshold26RR) {
            btnTimer26RR.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashingg26RR ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimer26RR.startAnimation(blinkAnimation);
            }else{
                btnTimer26RR.clearAnimation();
            }


        } else {
            btnTimer26RR.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimer26RR.clearAnimation();
        }
    }

}

