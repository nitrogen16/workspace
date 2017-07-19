package realizeAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value= RetentionPolicy.RUNTIME)
public @interface Changelog {
    //напиши свой код
    Revision[] value();
}