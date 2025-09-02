package com.neueda.kgs.model.embedded;

import lombok.Data;

import java.io.Serializable;

@Data
public class OsStat implements Serializable {
    private Long windows = 0L;
    private Long macOs   = 0L;
    private Long linux   = 0L;
    private Long android = 0L;
    private Long ios     = 0L;
    private Long others  = 0L;

    public void incrementWindows() { windows++; }
    public void incrementMacOs()   { macOs++; }
    public void incrementLinux()   { linux++; }
    public void incrementAndroid() { android++; }
    public void incrementIos()     { ios++; }
    public void incrementOthers()  { others++; }
}
