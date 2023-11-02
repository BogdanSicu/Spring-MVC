package com.run.web.mapper;

/*
M - Model
D - DTO (data transfer object)
 */

public interface MapperInterface<M, D> {

    public M toModel(D myDTO);

    public D toDTO(M myModel);

}
