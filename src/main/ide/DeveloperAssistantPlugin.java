package main.ide;


import java.lang.reflect.Method;
import java.util.ArrayList;

import java.util.List;

public class DeveloperAssistantPlugin {
    public static List<String> getSuggestions(Class<?> sourceClass) {
        List<String> allMethods = new ArrayList<>();


        for (Method m : sourceClass.getMethods()) {
            String method = m.toString();
            if (!method.contains(sourceClass.getClass().getPackageName()))
                allMethods.add(method);
        }

        return allMethods;
    }
}
