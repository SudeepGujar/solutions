package leetcode.algorithms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UniqueEmail {
    public int numUniqueEmails(String[] emails) {
        return Arrays.stream(emails)
                .map(email-> {
                    String[] split = email.split("@");
                    String name = split[0].split("\\+")[0].replace(".", "");
                    return name + "@" + split[1];
                })
                .collect(Collectors.toSet()).size();
    }
}
