package dao;

/**
 * The base level interface for the DAO
 */
public interface BaseDAO<T> {

    public T getObj(T objToGet);
    public T insertObj(T objToInsert);
    public T deleteObj(T objToDelete);

}
