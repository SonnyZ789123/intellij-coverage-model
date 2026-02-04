package com.kuleuven.blockmap.model;

import java.util.List;

public class BlockDataDTO {
    public final int id;
    public final String sourceHash;
    public final BlockCoverageDataDTO coverageData;
    public final List<Integer> parentBlockId;
    public final List<Integer> successorBlockIds;

    public BlockDataDTO(
            int id,
            String sourceHash,
            BlockCoverageDataDTO coverageData,
            List<Integer> predecessorBlockIds,
            List<Integer> successorBlockIds) {
        this.id = id;
        this.sourceHash = sourceHash;
        this.coverageData = coverageData;
        this.parentBlockId = predecessorBlockIds;
        this.successorBlockIds = successorBlockIds;
    }
}
