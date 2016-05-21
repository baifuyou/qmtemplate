package com.scratbai.qmtemplate;

import java.util.Map;

/**
 * Created by baifuyou on 16-5-4.
 */
public interface QMTemplate {
    String render(Map<String, Object> param);
}
