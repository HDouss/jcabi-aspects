package com.jcabi.aspects.aj;

import com.jcabi.aspects.Loggable;
import javax.validation.constraints.NotNull;

public class Dummy {

    @Loggable
    public void done() {
        Dummy.call(this);
    }

    private static void call(@NotNull Dummy d) {

    }
}
