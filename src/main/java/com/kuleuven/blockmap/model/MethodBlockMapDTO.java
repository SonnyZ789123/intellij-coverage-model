package com.kuleuven.blockmap.model;

import java.util.List;

public class MethodBlockMapDTO {

    public final String fullName;
    public final List<BlockDataDTO> blocks;

    public MethodBlockMapDTO(String fullName, List<BlockDataDTO> blocks) {
        this.fullName = fullName;
        this.blocks = blocks;
    }
}
