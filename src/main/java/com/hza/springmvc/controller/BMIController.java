package com.hza.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Create by hza
 * 2019-11-14 16:32
 *  体质指数（BMI）=体重（kg）÷身高^2（m）
 *
 *         例如：70kg÷（1.75m×1.75m）=22.86
 *
 *         此时我们给出一个指定值：
 *
 *         当BMI低于19时，提示“多吃点，太瘦了！注意加强营养~”
 *
 *         当BMI大于25时，提示“该减肥了！注意加强锻炼~”
 *
 *         当BMI在19~25之间时，提示：“体重正常，注意保持~”
 */
@Controller
@RequestMapping("/bmi")
public class BMIController {

    @PostMapping("/bmi")
    @ResponseBody
    public String bmi(Double hight, Double weight) {

        double m = hight / 100 ;

        Double bmi = weight / (m * m) ;

        if (bmi < 19) {
            return "多吃点，太瘦了！注意加强营养~" ;
        } else if (bmi > 25) {
            return "该减肥了！注意加强锻炼~" ;
        } else {
            return "体重正常，注意保持~" ;
        }
    }

    @PostMapping("/bmi1")
    @ResponseBody
    public ModelAndView bmi1(Double hight, Double weight) {

        ModelAndView mav = new ModelAndView() ;

        double m = hight / 100 ;

        Double bmi = weight / (m * m) ;

        String msg = "" ;
        if (bmi < 19) {
            msg = "多吃点，太瘦了！注意加强营养~" ;
        } else if (bmi > 25) {
            msg = "该减肥了！注意加强锻炼~" ;
        } else {
            msg = "体重正常，注意保持~" ;
        }

        return mav ;
    }

}
