package onboarding;

import java.util.*;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
//        List<String> answer = List.of("answer");
        List<String> answer = new ArrayList<>();
        System.out.println(forms.get(1).get(0));

        exit:
        for (int k = 0; k <forms.size(); k++) {
            String temp ="";
            String original = forms.get(k).get(1);

            for (int i = 0; i < forms.size(); i++) {
                if(i==k){
                    continue;
                }
                char[] c = forms.get(i).get(1).toCharArray();
                for (int j = 0; j < c.length - 1; j++) {
                 //   temp = String.valueOf(s.charAt(j) + s.charAt(j + 1));
                    temp = Character.toString(c[j])+ Character.toString(c[j+1]);

                    if(original.contains(temp)){
                        answer.add(forms.get(k).get(0));
                        continue exit;
                    }
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        List<List<String>> forms = List.of(
                List.of("jm@email.com", "제이엠"),
                List.of("jason@email.com", "제이슨"),
                List.of("woniee@email.com", "워니"),
                List.of("mj@email.com", "엠제이"),
                List.of("nowm@email.com", "이제엠")
        );
        List<String> solution = Problem6.solution(forms);
        System.out.println(solution);
    }

}
