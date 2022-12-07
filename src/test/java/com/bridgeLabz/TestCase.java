package com.bridgeLabz;

import junit.framework.Assert;
import org.junit.Test;

public class TestCase {
    UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
    @Test
    public void NameTest(){
        Assert.assertEquals(true, userRegistrationForm.checkFirstName("Saurav") );
    }
    @Test
    public void LastNameTest(){
        Assert.assertEquals(true, userRegistrationForm.checkLastName("Raj") );
    }
    @Test
    public void EmailTest(){
        Assert.assertEquals(true, userRegistrationForm.checkEmailAddress("saurav.raj4986@gmail.com") );
    }
    @Test
    public void PhoneTest(){
        Assert.assertEquals(true, userRegistrationForm.checkMobileNumber("+91 9337564989") );
    }
    @Test
    public void PasswordTest(){
        Assert.assertEquals(true, userRegistrationForm.checkPassword("01@Lbcdefgh") );
    }

    @Test
    public void NameTest2(){
        Assert.assertEquals(true, userRegistrationForm.checkFirstName("saurav") );
    }
    @Test
    public void LastNameTest2(){
        Assert.assertEquals(true, userRegistrationForm.checkLastName("raj") );
    }
    @Test
    public void EmailTest2(){
        Assert.assertEquals(true, userRegistrationForm.checkEmailAddress("Saurav.raj4986@gmail.com") );
    }
    @Test
    public void PhoneTest2(){
        Assert.assertEquals(true, userRegistrationForm.checkMobileNumber("+91 93337564989") );
    }
    @Test
    public void PasswordTest2(){
        Assert.assertEquals(true, userRegistrationForm.checkPassword("01Lbcdefgh") );
    }
}
