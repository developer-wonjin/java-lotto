package lotto.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoRules {

    private final static int START_NUM = 1;
    private final static int LAST_NUM = 45;
    private final static int START_INDEX = 0;
    private final static int LAST_INDEX = 6;

    private final List<Integer> baseLottoNumbers;

    public LottoRules() {
        baseLottoNumbers = new ArrayList<>();
        for (int i = START_NUM; i <= LAST_NUM; i++) {
            baseLottoNumbers.add(i);
        }
    }

    public List<Integer> makeLottoNumbers() {
        Collections.shuffle(baseLottoNumbers);
        return baseLottoNumbers.subList(START_INDEX, LAST_INDEX);
    }

}
