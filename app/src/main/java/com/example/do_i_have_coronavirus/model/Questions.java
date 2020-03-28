package com.example.do_i_have_coronavirus.model;

public class Questions
{

    private String q1,q2,q3,q4,q5,q6,q7;
    private String language;
    private String yes,no;

    public Questions(String language)
    {
        this.language=language;
        if((this.language.equals("English")) || (this.language.equals("english")) || (this.language.equals("en")))
        {
            //All questions are in English
            this.yes = "Yes";
            this.no = "No";
            this.q1 = "";
            this.q2 = "";
            this.q3 = "";
            this.q4 = "";
            this.q5 = "";
            this.q6 = "";
            this.q7 = "";
        }
        else
        {
            if((this.language.equals("French")) || (this.language.equals("french")) || (this.language.equals("fr")))
            {
                //All question are in French
                this.yes = "Oui";
                this.no = "Non";
                this.q1 = "";
                this.q2 = "";
                this.q3 = "";
                this.q4 = "";
                this.q5 = "";
                this.q6 = "";
                this.q7 = "";
            }
            else
            {
                if((this.language.equals("English")) || (this.language.equals("english")) || (this.language.equals("en")))
                {
                    //All questions are in Arabic
                    this.yes = "";
                    this.no="";
                    this.q1 = "";
                    this.q2 = "";
                    this.q3 = "";
                    this.q4 = "";
                    this.q5 = "";
                    this.q6 = "";
                    this.q7 = "";
                }
                // you can add other bloc to validate other languages
            }
        }
    }

    public String getQ1()
    {
        return this.q1;
    }

    public String getQ2()
    {
        return this.q2;
    }

    public String getQ3()
    {
        return this.q3;
    }

    public String getQ4()
    {
        return this.q4;
    }

    public String getQ5()
    {
        return this.q5;
    }

    public String getQ6()
    {
        return this.q6;
    }

    public String getQ7()
    {
        return this.q7;
    }

    public String getYes()
    {
        return this.yes;
    }

    public String getNo()
    {
        return this.no;
    }

}
