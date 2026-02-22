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
            List<Integer> parentBlockIds,
            List<Integer> successorBlockIds) {
        this.id = id;
        this.blockHash = blockHash;
        this.coverageData = coverageData;
        this.parentBlockIds = parentBlockIds;
        this.successorBlockIds = successorBlockIds;
    }
}
