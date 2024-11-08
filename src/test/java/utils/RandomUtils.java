package utils;

import com.github.javafaker.Faker;

public class RandomUtils {

    Faker faker = new Faker();

    public String getRandomUserPhone() {
        return faker.number().digits(10);
    }
}
