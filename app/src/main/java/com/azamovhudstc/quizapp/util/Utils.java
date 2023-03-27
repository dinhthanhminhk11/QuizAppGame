package com.azamovhudstc.quizapp.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;


import com.azamovhudstc.quizapp.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Utils {



    public static String formatDate(long time){
        @SuppressLint({"NewApi", "LocalSuppress"}) SimpleDateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return formatter.format(calendar.getTime());
    }

    public static Map<String,String> getMathQuestions(){
        HashMap<String,String> questions = new HashMap<>();
        questions.put("4*3","12");
        questions.put("5*12","60");
        questions.put("127-45","82");
        questions.put("y=−6x+8","78");
        questions.put("43*27","1161");
        questions.put("175/5","35");
        questions.put("20/2(5+5) ","100");
        questions.put("134/2+(12*4)","115");
        questions.put("56*31","1736");
        questions.put("1748/76","23");
        questions.put("3456/432","8");
        questions.put("23/77","1771");
        questions.put("32/4","8");
        questions.put("2892/723","4");
        questions.put("55/5","11");

        return questions;
    }

    public static Map<String,String> getRandomMathQuestions(int SIZE){
        HashMap<String,String> questionsMap = new HashMap<>();
        Map<String,String> originalQuestion = getMathQuestions();
        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }



    public static Map<String,Map<String,Boolean>> getLiteratureQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Ếch",false);
        answer1.put("Thằn lằn",false);
        answer1.put("Cóc",true);
        answer1.put("Nhái",false);
        questions.put("Đâu là một loại hình chợ tam tự phát thường xuất hiện trong các khu dân cư",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Đá lăn ",false);
        answer2.put("Đá nhảy",true);
        answer2.put("Đá chạy",false);
        answer2.put("Đá bò",false);
        questions.put("Đâu là tên một bãi biển đẹp ở quảng bình ?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("Nhật bản",true);
        answer3.put("Mông cổ",false);
        answer3.put("Trung quốc",false);
        answer3.put("Hàn quốc",false);
        questions.put("Haiku là thể thơ truyền thống của nước nào?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Khoái",true);
        answer4.put("Sướng",false);
        answer4.put("Thích",false);
        answer4.put("Vui",false);
        questions.put("Đâu là tên một loại bánh Huế",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("D1",true);
        answer5.put("C1",false);
        answer5.put("A1",false);
        answer5.put("B2",false);
        questions.put("Tượng đài chiến thắng Điện Biên Phủ được dựng trên ngon đồi nào?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("16th",true);
        answer6.put("17th",false);
        answer6.put("14th",false);
        answer6.put("15th",false);
        questions.put("Màu chủ đạo của tờ tiền Polymer mệnh giá 500.000 đồng là gì?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("Hoa hướng dương",false);
        answer7.put("Hoa hồng",false);
        answer7.put("Hoa Đào",false);
        answer7.put("Hoa sen",true);
        questions.put("Bảo tàng Hồ chí minh được thiết kế theo dáng một loài hoa nào?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Tháng bảy",true);
        answer8.put("Tháng chín",false);
        answer8.put("Tháng tám",false);
        answer8.put("Tháng mười",false);
        questions.put("Tháng âm lịch nào còn được gọi là tháng cô hồn?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Gió",true);
        answer9.put("Núi",false);
        answer9.put("Mây",false);
        answer9.put("Biển",false);
        questions.put("Có câu thành ngữ: `Đi mây về .. gì`?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("Sao quả tạ",true);
        answer10.put("Sao quả cân",false);
        answer10.put("Sao quả yến",false);
        answer10.put("Sao quả tấn",false);
        questions.put("Đâu là một cách nói vi von về nhứng trường hợp hay gặp vận hạn, rủi ro?",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Đen",true);
        answer11.put("Vàng",false);
        answer11.put("Nâu",false);
        answer11.put("Xanh",false);
        questions.put("Gỗ mun màu gì?",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("Diễn viên hài",true);
        answer12.put("Võ si quyền anh",false);
        answer12.put("Bác sĩ phẫu thuật",false);
        answer12.put("Doanh nhân",false);
        questions.put("Tân Tổng Thống Ukraine Volodaymyr Zelensky làm nghề gì trước khi nhậm chức?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("Thân cô thế cô",true);
        answer13.put("Thân lừa ưu nặng",false);
        answer13.put("Thân tàn ma dại",false);
        answer13.put("Thân làm tội đời",false);
        questions.put("Tình cảm đơn đọc, yếu thế không có chỗ dựa là nghĩa của câu nào?",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("Tò he",true);
        answer14.put("Tò mò",false);
        answer14.put("Tò vò",false);
        answer14.put("Tến tò",false);
        questions.put("Đâu là tên một loại đồ chơi dân gian của trẻ em?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Quốc an",true);
        answer15.put("Bảo chấn",false);
        answer15.put("Trịnh Công Sơn",false);
        answer15.put("Trần Tiến",false);
        questions.put("Nhạc sĩ nào là người sáng tạc ca khúc `Cây đàn sinh viên`",answer15);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getGeographyQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("3",false);
        answer1.put("6",false);
        answer1.put("12",true);
        answer1.put("1",false);
        questions.put("4*3 ?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("60",true);
        answer2.put("12",false);
        answer2.put("53",false);
        answer2.put("14",false);
        questions.put("5*12 ?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("116",false);
        answer3.put("115",true);
        answer3.put("112",false);
        answer3.put("113",false);
        questions.put("134/2+(12*4) ?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        questions.put("2892/723 ?",answer4);
        answer4.put("5",false);
        answer4.put("16",true);
        answer4.put("4",false);
        answer4.put("15",false);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("13",false);
        answer5.put("12",false);
        answer5.put("5",false);
        answer5.put("11",true);
        questions.put("55/5 ? ",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("101",false);
        answer6.put("131",false);
        answer6.put("100",true);
        answer6.put("112",false);
        questions.put("20/2(5+5) ?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("1161",true);
        answer7.put("123",false);
        answer7.put("1421",false);
        answer7.put("1612",false);
        questions.put("43*27?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("82",true);
        answer8.put("83",false);
        answer8.put("84",false);
        answer8.put("85",false);
        questions.put("127-45?",answer8);
//
        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("-4a + 22b",true);
        answer9.put("4a + 22b",false);
        answer9.put("28a + 30b",false);
        answer9.put("-28a + 30b",false);
        questions.put("12a + 26b -4b – 16a ?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put(" -1",false);
        answer10.put("2",true);
        answer10.put("–2",false);
        answer10.put("6",false);
        questions.put("(4 – 5) – (13 – 18 + 2) ?",answer10);


        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("25",false);
        answer12.put("24",false);
        answer12.put("17",false);
        answer12.put("13",true);
        questions.put("3 + 2 * (8 – 3)?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("7",false);
        answer13.put("5",false);
        answer13.put("9",true);
        answer13.put("8",false);
        questions.put("3^(4)÷3^(2) ?",answer13);



        return questions;
    }

    public static Map<String,Map<String,Boolean>> getRandomLiteratureAndGeographyQuestions(Context context, String subject, int SIZE){
        Map<String,Map<String,Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;
        if (subject.equals(context.getString(R.string.geography))){
            originalQuestion = getGeographyQuestions();
        }else{
            originalQuestion = getLiteratureQuestions();
        }

        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }

}
