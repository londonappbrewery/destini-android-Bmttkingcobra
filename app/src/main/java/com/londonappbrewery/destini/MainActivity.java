package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mTopButton,mBelowButton;
    int mQuestion,mAnswerA,mAnswerB;
    int mIndex;
    boolean selection;

    private Questions[] QuestionsArray=new Questions[]
    {
            new Questions(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new Questions(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new Questions(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton=(Button) findViewById(R.id.buttonTop);
        mBelowButton=(Button) findViewById(R.id.buttonBottom);




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mIndex==0)
                {
                    path1("A1");
                }
                else
                    if(mIndex==2)
                    {
                        path1("A2");
                    }
                    else
                        if (mIndex==1)
                        {
                            path1("A3");
                        }

            }
        });

        mBelowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mIndex==0)
                {
                    path1("B1");
                }
                else
                    if (mIndex==1)
                    {
                        path1("B2");
                    }
                    if (mIndex==2)
                    {
                        path1("B3");
                    }
            }
        });
    }

    private void path1(String userselection)
    {
        if(userselection=="A1")
        {
            mIndex=2;
            mQuestion=QuestionsArray[mIndex].getQuestionID();
            mAnswerA=QuestionsArray[mIndex].getQuestionAnswerA();
            mAnswerB=QuestionsArray[mIndex].getQuestionAnswerB();
            mStoryTextView.setText(mQuestion);
            mTopButton.setText(mAnswerA);
            mBelowButton.setText(mAnswerB);
        }
        else
            if(userselection=="A2")
        {
            mStoryTextView.setText(R.string.T6_End);
            mTopButton.setVisibility(View.GONE);
            mBelowButton.setVisibility(View.GONE);

        }
        else
            if(userselection=="B1")
            {
                mIndex=1;
                mQuestion=QuestionsArray[mIndex].getQuestionID();
                mAnswerA=QuestionsArray[mIndex].getQuestionAnswerA();
                mAnswerB=QuestionsArray[mIndex].getQuestionAnswerB();
                mStoryTextView.setText(mQuestion);
                mTopButton.setText(mAnswerA);
                mBelowButton.setText(mAnswerB);
            }
            else
                if(userselection=="A3")
                {
                    mIndex=2;
                    mQuestion=QuestionsArray[mIndex].getQuestionID();
                    mAnswerA=QuestionsArray[mIndex].getQuestionAnswerA();
                    mAnswerB=QuestionsArray[mIndex].getQuestionAnswerB();
                    mStoryTextView.setText(mQuestion);
                    mTopButton.setText(mAnswerA);
                    mBelowButton.setText(mAnswerB);
                }
                else
                    if(userselection=="B2")
                    {
                        mStoryTextView.setText(R.string.T4_End);
                        mTopButton.setVisibility(View.GONE);
                        mBelowButton.setVisibility(View.GONE);
                    }
                    else
                    {
                        mStoryTextView.setText(R.string.T5_End);
                        mTopButton.setVisibility(View.GONE);
                        mBelowButton.setVisibility(View.GONE);

                    }


    }



}
