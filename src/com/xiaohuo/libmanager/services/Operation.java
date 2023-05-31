package com.xiaohuo.libmanager.services;
/*
 * @Author XU XIAO
 * */
public interface Operation {
    public void Delete(String name, String password);
    /**
    * @type：Delete
    *@param:Delete User or administrator
    * */
    public void Add(String name, String password);
    /**
     *@Type: Add
     *@param: Add User or Admin to the arrayAdd
     **/


    boolean CheckAdmin();

    void exit(Manager manager);
    /**
     * @Type:
     * @param: check all the administrator
     * */
}
