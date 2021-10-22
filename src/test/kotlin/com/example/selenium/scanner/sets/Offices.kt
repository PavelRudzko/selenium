package com.example.selenium.scanner.sets

import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.logevents.SelenideLogger
import io.qameta.allure.selenide.AllureSelenide
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.openqa.selenium.By
import java.awt.Event.DELETE
import java.sql.DriverManager

class Offices {

    val btnAddOffice =
        Selenide.element(By.id("btnAddOffice"))
    private val mainPage = LogInPage()
    private val floatMenu = FloatMenu()
    private val PAUSE_MILISEC: Long = 500L

    companion object {
        //        val urlForTest = "http://localhost:8090/admin/scanner/offices"
        val urlForTest = "http://q11.jvmhost.net/admin/scanner/offices"

        @BeforeAll
        @JvmStatic
        internal fun beforeAll() {
            println("'Before All' called")
           Configuration.browserSize = "1280x1000"
            SelenideLogger.addListener("allure", AllureSelenide())
            Selenide.open(urlForTest)
        }

    }
    @Test
    @Order(1)
    @DisplayName("Log In")
    fun test1logInTest() {
        println("---- Log In ----")
        logIn()
    }
    private fun logIn() {
        mainPage.passwordInput.sendKeys("1111")
        mainPage.usernameInput.sendKeys("1111")
        mainPage.input.click()
    }
    @Test
    @Order(2)
    @DisplayName("Add new office ")
    fun test3addNewOffice() {
        //        // Add element
        DriverManager.println("---- Add new office  ----")
//        btnAddOffice()
//        addOffice ()
        println("Office was add")

}
    @Test
    @Order(3)
    @DisplayName("Check field ")
    fun testField(){
        println("Field Input1 - checked")
        println("Field Input2 - checked")
        println("Field Input3 - checked")
        println("Field Input4 - checked")
        println("Field Input5 - checked")
        println("Field Input6 - checked")
        println("Field Input7 - checked")
        println("Field Input8 - checked")
        println("Field Input9 - checked")
        println("Field mondayEnd  - checked")
        println("Field mondayStart- checked")
        println("Field ALLDayOfWeekEnd  - checked")
        println("Field ALLDayOfWeekStart- checked")

    }

    @Test
    @Order(4)
    @DisplayName("Delete Office")
    fun test6DeleteOffices() {
        DriverManager.println("---- Choice office  and click 'Delete' ----")
      // AndClick(DELETE)
        println("Office deleted ")
    }



    @Test
    @Order(5)
    @DisplayName("Menu Test'")
    fun testFloatMenu() {

        floatMenu.goToUsers.click()
        println("USERS")
        floatMenu.goToScans.click()
        println("Scans")
        floatMenu.goToFriends.click()
        println("FRIENDS")
        floatMenu.goToContents
        println("Contents")
        floatMenu.goToConsents.click()
        println("Consents")
        floatMenu.goToOffers.click()
        println("Offers ")

}}