package com.example.do_i_have_coronavirus.operations;

public class Validation
{
    private Calcul calcul;
    private String resultOfTest;

    public Validation(Calcul calcul)
    {
        this.calcul=calcul;

    }

    public String getResultOfTest()
    {
        return this.resultOfTest;
    }

}
