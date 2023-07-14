package com.autoc0de.utils;


import com.autoc0de.exceptions.InexistentVariableException;
import com.autoc0de.utils.actions.strings.Strings;
import com.autoc0de.utils.actions.strings.Structure;
import io.github.classgraph.*;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {

    private Utils() {}

    private static ThreadLocal<WebDriverWait> wait = new ThreadLocal();
    private static ThreadLocal<FluentWait<EventFiringWebDriver>> fluentWait = new ThreadLocal();

    public static String processLocator( String variable ) {
        try ( ScanResult result = new ClassGraph().enableClassInfo().enableAnnotationInfo().enableFieldInfo()
                .whitelistPackages( "com.autoc0de.constantes" ).scan() ) {
            ClassInfoList classes = result.getAllClasses();
            for ( ClassInfo clazz : classes ) {
                for ( FieldInfo field : clazz.getFieldInfo() ) {
                    if ( field.getName().equals( variable ) ) {
                        if ( StringUtils.isBlank( ( String ) field.loadClassAndGetField().get( 0 ) ) )
                            return variable;
                        return ( String ) field.loadClassAndGetField().get( 0 );
                    }
                }
            }
        } catch ( IllegalAccessException e ) {
            e.printStackTrace();
        }
        throw new InexistentVariableException( variable );
    }

    public static String getMixedString() {
        return new Strings.Builder()
                .withSize(15)
                .withStructure(Structure.MIXED)
                .withNumbers()
                .get();
    }

    public static String getStringOnlyWithNumbers() {
        return new Strings.Builder()
                .withSize(15)
                .withOnlyNumbers()
                .get();
    }

    public static String getMayusString() {
        return new Strings.Builder()
                .withSize(15)
                .withStructure(Structure.MAYUS)
                .get();
    }

    public static String getMinusString() {
        return new Strings.Builder()
                .withSize(15)
                .withStructure(Structure.MINUS)
                .get();
    }

    public static String getStringLessThan8Characters() {
        return new Strings.Builder()
                .withSize(7)
                .withStructure(Structure.MIXED)
                .get();
    }

    public static String getStringLessThan5Characters() {
        return new Strings.Builder()
                .withSize(4)
                .withStructure(Structure.MIXED)
                .get();
    }
    public static String getStringmoreThan32Characters() {
        return new Strings.Builder()
                .withSize(35)
                .withStructure(Structure.MIXED)
                .get();
    }
    public static String getStringWithStrangeCharacters(){
        return new Strings.Builder()
                .withSize(15)
                .withStrangeCaracters()
                .get();
    }
    public static String getStringWithLettersAndStrangeCharacters(){
        return  new Strings.Builder()
                .withSize(10)
                .withLetterAndStrangeCharacter()
                .get();
    }

    /** Limpieza de waits**/
    public static void removeWaits() {
        wait.remove();
        fluentWait.remove();
    }

}
