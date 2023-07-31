package com.cqut.atao.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName Resource.java
 * @Description 资源接口
 * @createTime 2023年07月26日 17:04:00
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
