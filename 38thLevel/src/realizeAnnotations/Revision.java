package realizeAnnotations;

public @interface Revision {
    //напиши свой код
    int revision ();
    Date date ();
    Author[] authors() default {};
    String comment() default "";;

    //String comment();
}
