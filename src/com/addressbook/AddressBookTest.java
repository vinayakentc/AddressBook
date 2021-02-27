package com.addressbook;


import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {

	@Test
    public void firstNameTest() {
        ValidateContact contact = new ValidateContact();
        boolean result = contact.validateFirstName("Aditya");
        Assert.assertTrue(true);
 } 
 @Test
    public void lastNameTest() {
        ValidateContact contact = new ValidateContact();
        boolean result = contact.validateLastName("Kumar");
        Assert.assertTrue(true);
 }
 @Test
    public void emailTest() {
        ValidateContact contact = new ValidateContact();
        boolean result = contact.validateEmail("abc.xyz@bridgelabz.co.in");
        Assert.assertTrue(true);
 }
 @Test
    public void phoneNoTest() {
        ValidateContact contact = new ValidateContact();
        boolean result = contact.validatePhoneNo("91 1234567895");
        Assert.assertTrue(true);
 }
 @Test
    public void addressTest() {
        ValidateContact contact = new ValidateContact();
        boolean result = contact.validateAddress("jamshedpur");
        Assert.assertTrue(true);
 }
 @Test
    public void cityTest() {
        ValidateContact contact = new ValidateContact();
        boolean result = contact.validateCity("jamshedpur");
        Assert.assertTrue(true);
 }
 @Test
    public void stateTest() {
        ValidateContact contact = new ValidateContact();
        boolean result = contact.validateState("Jharkhand");
        Assert.assertTrue(true);
 }
}
