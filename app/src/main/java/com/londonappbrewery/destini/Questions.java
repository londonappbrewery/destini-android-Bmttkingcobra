package com.londonappbrewery.destini;

public class Questions {

    private int mQuestionID;
    private int mQuestionAnswerA,mQuestionAnswerB;

    public Questions(int QuestionID, int AnswerA,int  AnswerB)
    {
        mQuestionID=QuestionID;
        mQuestionAnswerA=AnswerA;
        mQuestionAnswerB=AnswerB;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public int getQuestionAnswerA() {
        return mQuestionAnswerA;
    }

    public void setQuestionAnswerA(int questionAnswerA) {
        mQuestionAnswerA = questionAnswerA;
    }

    public int getQuestionAnswerB() {
        return mQuestionAnswerB;
    }

    public void setQuestionAnswerB(int questionAnswerB) {
        mQuestionAnswerB = questionAnswerB;
    }
}
