package com.kuleuven.blockmap.model;

import java.util.List;

public class BlockDataDTO {
    public final int id;
    public final String blockHash;
    public final BlockCoverageDataDTO coverageData;
    public final List<Integer> parentBlockIds;
    public final List<Integer> successorBlockIds;

    public BlockDataDTO(
            int id,
            String blockHash,
            BlockCoverageDataDTO coverageData,
            List<Integer> predecessorBlockIds,
            List<Integer> successorBlockIds) {
        this.id = id;
        this.blockHash = blockHash;
        this.coverageData = coverageData;
        this.parentBlockIds = predecessorBlockIds;
        this.successorBlockIds = successorBlockIds;
    }
}
