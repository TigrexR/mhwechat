package com.tigrex.mh.entity.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author linus
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SystemRoleBO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String name;
}
