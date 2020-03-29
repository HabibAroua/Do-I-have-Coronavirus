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
            this.q1 = "Have you traveled to an affected area ?";
            this.q2 = "Do you have symptoms of a cold ?";
            this.q3 = "Do you have a dry cough ?";
            this.q4 = "Do you have heat ?";
            this.q5 = "Have you treated, sat or been near a patient for whom you have confirmed a Coronavirus infection ?";
            this.q6 = "Do you have a friend or relative who has cold symptoms, fever, or a dry cough?";
            this.q7 = "Do you work in a health care facility as a doctor or nurse or do you work in auxiliary medical staff ?";
        }
        else
        {
            if((this.language.equals("French")) || (this.language.equals("french")) || (this.language.equals("fr")))
            {
                //All question are in French
                this.yes = "Oui";
                this.no = "Non";
                this.q1 = "Avez-vous voyagé dans une zone affectée ?";
                this.q2 = "Avez-vous des symptômes de rhume ?";
                this.q3 = "Avez-vous une toux sèche ?";
                this.q4 = "Avez-vous de la chaleur ?";
                this.q5 = "Avez-vous traité, assis ou été à proximité d'un patient pour lequel vous avez confirmé une infection par le Coronavirus ?";
                this.q6 = "Avez-vous un ami ou un parent qui a des symptômes de rhume, de fièvre ou une toux sèche ?";
                this.q7 = "Travaillez-vous dans un établissement de santé en tant que médecin ou infirmière ou travaillez-vous dans du personnel médical auxiliaire ?";
            }
            else
            {
                if((this.language.equals("Arabic")) || (this.language.equals("arabic")) || (this.language.equals("ar")))
                {
                    //All questions are in Arabic
                    this.yes = "نعم";
                    this.no="لا";
                    this.q1 = "هل سافرت الى منطقه مصابة ؟";
                    this.q2 = "هل لديك أعراض برد و زكام ؟";
                    this.q3 = "هل لديك سعال جاف ؟";
                    this.q4 = "هل لديك حرارة ؟";
                    this.q5 = "تعاملت او جالست او كنت بالقرب من مريض أكدت له الأصابة بفايروس كورونا ؟";
                    this.q6 = "هل لك صديق او قريب له أعراض زكام أو حرارة أو سعال جاف ؟" ;
                    this.q7 = " هل انت تعمل في أحد الأطقم الرعاية الصحيه طبيب أو ممرض او تعمل في الأطقم الطبية المساعدة ؟";
                }
                // you can add other bloc to validate other languages
            }
        }
    }

    public String getLanguage()
    {
        return this.language;
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
/*


يطبق هذا النموذج بعد أول ظهور لحاله ايجابيه
في البلد أو كنت في بلد مصاب بالكورونا و رجعت

كل نقطه من هذه النقاط تأخذ علامه محدده
بعد ذلك تجمع العلامات و المجموع الكلي
هو الذي يحدد ماذا تفعل

🔴 هل سافرت الى منطقه مصابة ؟ (نعم/لا)
اذا كانت الاجابة بنعم تأخذ علامتين
🔴هل لديك أعراض برد و زكام ؟ (نعم/لا)
اذا كانت الاجبة بنعم تأخذ علامه
🔴هل لديك سعال جاف ؟ (نعم/لا)
اذا كانت الاجابه بنعم تأخذ علامه
🔴هل لديك حرارة ؟(نعم/لا)
اذا كانت الاجابة بنعم تأخذ علامه
🔴 تعاملت او جالست او كنت بالقرب من مريض
أكدت له الأصابة بفايروس كورونا ؟ (نعم/لا)
اذا كانت الاجابة بنعم تأخذ 3 علامات
🔴هل لصديق او قريب لك أعراض زكام
أو حرارة أو سعال جاف ؟(نعم/لا)
اذا كانت الاجابة بنعم تأخذ تأخذ علامه
🔴 هل انت تعمل في أحد الأطقم الرعاية الصحيه طبيب
أو ممرض او تعمل في الأطقم الطبية المساعدة ؟ (نعم/لا)
اذا كانت الاجابة بنعم تأخذ علامه

🔰إجمع العلامات معا 🔰

إذا كان مجموع العلامات

✅أقل من 3 》》》》》》 إصابتك أحتمال ضئيل راقب نفسك و إعزل نفسك عن الناس

✅من 3 إلى 5 》》》》》أنت حالة مشتبهه يعزل و تجرى له الفحوصات

✅ من 5 إلى 10》》》》》 أنت حالة شبه مؤكدة يجب أن تعزل و تفحص و تأكد و تلقى الرعاية الصحية

د/محمد المنفي

 */