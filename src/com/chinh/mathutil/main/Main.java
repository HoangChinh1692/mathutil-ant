/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinh.mathutil.main;

import com.chinh.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        testFatorialGivenWrongArgumentThrowsException();
        testFatorialGivenRightArgumentReturnsWell();
    }
    //Kiểm thử các tình huống n đưa vào kiểm cà chớn!!!
    public static void testFatorialGivenWrongArgumentThrowsException() {
        //Test case#6: test getF() with n = -1;
        //Expected value : an Illegal Argument Exception is throw
        //nếu đưa n = -1 thì hàm sẽ đập vào mặt user/người xài
        //hàm 1 ngoại lệ
        System.out.println("Test -1! | expected: Illegal Argument Exception is throw!!!"
                + " | actual: ???");
        MathUtility.getFactorial(-1);      
    }
    //Dân dev phải có trách nhiêm với những hàm/method mình viết
    //ra, tức là đảm bảo rằng hàm chạy đúng như thiết kế
    //nếu getFactorial đc thiết kế rằng:
    //nếu đưa n < 0 n > 20 chửi, ném ra ngoại lệ
    //nếu đưa n = 0.. -> tính đúng n!
    //Ta - Dân Dev sẽ kiểm thử hàm đúng như thiết kế hay không
    //Kiểm Thử - Dùng Thử - Mô Phỏng các tình huống - Case
    //Hàm sẽ được dùng trong tương lai
    //hàm sẽ được dùng theo 2 cách dựa theo thiết kế
    //đưa data tử tế n từ..20
    //đưa data cà chớn n < 0 hoặc n > 20
    //tên hàm kiểm thử viết theo cú pháp con lạc đà - camel Case nota
    //và phải mang ý nghĩa/mục đích kiểm thử
    public static void testFatorialGivenRightArgumentReturnsWell() {
        //Case #1: Test getF() with n = 0
        //Expected value: 2;
        //Kiểm thử coi có đúng 0! = 1 hay không? - 1 tình huống xài hàm
        //1 test case
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n); //gọi hàm tính giai thừa, xem kq trả về
        //so sánh expected và actual
        System.out.println("Test " + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);

        //Case #2: test getF() with n = 1;
        //Expected value = 1 luôn.
        //Kiểm tra xem 1! có đúng là 1 hem??
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);

        //Test case #3: test getF() with n = 2;
        System.out.println("Test 2! | expected: 2 " + " | actual: " + MathUtility.getFactorial(2));

        //Test case #4: test getF() with n = 3;
        System.out.println("Test 3! | expected: 6 " + " | actual: " + MathUtility.getFactorial(3));

        //Test case #5: test getF() with n = 5;
        System.out.println("Test 5! | expected: 120 " + " | actual: " + MathUtility.getFactorial(5));
    }
}
