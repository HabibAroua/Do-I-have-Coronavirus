package com.example.do_i_have_coronavirus.model;

public class Answers
{
    private String a1,a2,a3;
    private String language;

    public Answers(String language)
    {
        this.language=language;
        if((this.language.equals("English")) || (this.language.equals("english")) || (this.language.equals("en")))
        {
            //All answers are in English
        }
        else
        {
            if((this.language.equals("French")) || (this.language.equals("french")) || (this.language.equals("fr")))
            {
                //All answers are in French
            }
            else
            {
                if((this.language.equals("Arabic")) || (this.language.equals("arabic")) || (this.language.equals("ar")))
                {
                    //All answers are in Arabic
                }
                // you can add other bloc to validate other languages
            }
        }
    }
}
