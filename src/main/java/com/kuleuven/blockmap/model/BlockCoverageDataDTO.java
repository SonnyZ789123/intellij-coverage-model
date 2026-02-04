package com.kuleuven.blockmap.model;

import com.kuleuven.coverage.model.LineDTO;

import java.util.List;

public class BlockCoverageDataDTO {
    public enum CoverageState {
        COVERED,
        NOT_COVERED,
        PARTIALLY_COVERED
    }

    public final List<LineDTO> lines;
    public final CoverageState coverageState;

    public BlockCoverageDataDTO(List<LineDTO> lines, CoverageState coverageState) {
        this.lines = lines;
        this.coverageState = coverageState;
    }
}
