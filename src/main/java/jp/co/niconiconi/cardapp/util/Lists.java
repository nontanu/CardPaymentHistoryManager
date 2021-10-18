package jp.co.niconiconi.cardapp.util;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * リストのUtilクラス.
 * @author pingp
 *
 */
public class Lists {

    public static <TO, FROM> List<TO> convertInternalObject(List<FROM> fromList, Function<? super FROM, ? extends TO> mapper) {
        List<TO> toList = fromList.stream().map(mapper)
                .collect(Collectors.toList());
        return toList;
    }

}
