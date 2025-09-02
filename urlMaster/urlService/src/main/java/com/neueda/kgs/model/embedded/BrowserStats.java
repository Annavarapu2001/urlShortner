package com.neueda.kgs.model.embedded;

import lombok.Data;

import java.io.Serializable;

@Data
public class BrowserStats implements Serializable {

    private Long ie = 0L;
    private Long fireFox = 0L;
    private Long chrome = 0L;
    private Long opera = 0L;
    private Long safari = 0L;
    private Long others = 0L;

    public void incrementIe()       { ie++; }
    public void incrementFireFox()  { fireFox++; }
    public void incrementChrome()   { chrome++; }
    public void incrementOpera()    { opera++; }
    public void incrementSafari()   { safari++; }
    public void incrementOthers()   { others++; }
}
