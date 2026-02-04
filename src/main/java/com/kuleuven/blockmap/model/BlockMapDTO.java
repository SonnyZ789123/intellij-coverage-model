package com.kuleuven.blockmap.model;

import java.util.List;

public class BlockMapDTO {

    public final List<MethodBlockMapDTO> methodBlockMaps;

    public BlockMapDTO(List<MethodBlockMapDTO> methodBlockMaps) {
        this.methodBlockMaps = methodBlockMaps;
    }
}
