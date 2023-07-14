package com.autoc0de.utils;


import com.autoc0de.generic.GenService;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class Actions {

    public static Map<String, Consumer<String>> actions = new HashMap<>();

//    public static final Consumer<String> verifyIfIsDisplayed     = v -> Assert.assertTrue( waitVisibility( v ).isDisplayed() );
//    public static final Consumer<String> verifyIfIsEnabled       = v -> Assert.assertTrue( waitVisibility( v ).isEnabled() );
//    public static final Consumer<String> verifyIfIsSelected      = v -> Assert.assertTrue( waitVisibility( v ).isSelected() );
//    public static final BiConsumer<String, String> sendKeys      = ( locator, value ) -> waitVisibility( locator ).sendKeys( value );
//    public static final Consumer<String> click                   = v -> waitVisibility( Utils.processLocator( v ) ).click();
//    public static final Consumer<String> scroll                  = v -> waitVisibility( Utils.processLocator( v ) ).sendKeys(Keys.CONTROL, Keys.END);
//    public static final BiConsumer<String, String> assertBetween = GenService::assertBetween;

    public static <T> void actionFor( T locator, Consumer<T> consumer ) {
        consumer.accept( locator );
    }

    public static <T, U> void actionFor( T locator, U value, BiConsumer<T, U> biConsumer ) {
        biConsumer.accept( locator, value );
    }

    public static <T> void actionsFor( Map<T, Consumer<T>> map ) {
        map.forEach( ( key, consumer ) -> consumer.accept( key ) );
        actions.clear();
    }

    public static <T> Consumer<T> execute(Consumer<String> consumer, String locator) {
        return (T t) -> consumer.accept(locator);
    }

    public static <T, U> BiConsumer<T, U> execute(BiConsumer<String, String> biConsumer, String locator, String sequence) {
        return (T t, U u) -> biConsumer.accept(locator, sequence);
    }

}