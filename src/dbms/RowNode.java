package dbms;

import dbms.TableRootNode;

public class RowNode {
    public RowNode(Object[] objects){ //can be used to pass a premade Object array to the class
        dataFields = objects;
        // key = rowNodeKey;
        // rowNodeKey++;
    }

    TableRootNode parent;
    int key;

    Object[] dataFields = new Object[this.parent.getAttributeSize()];
    //this Object array contains all the VARCHARS and integers in the rows
    public Object getDataField(int index){
        return dataFields[index];
    }
    public Object[] getDataFields(){return dataFields;}
    public void setDataField(int index, Object data){
        dataFields[index] = data;
    }
    public String getRelation(){
        return this.parent.relationName;
    }

    @Override
    public boolean equals(Object obj) {

        // checking if both the object references are
        // referring to the same object.
        if(this == obj)
            return true;

        // it checks if the argument is of the
        // type rowNode by comparing the classes
        // of the passed argument and this object.
        // if(!(obj instanceof rowNode)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        // type casting of the argument.
        RowNode row = (RowNode) obj;

        // comparing the state of argument with
        // the state of 'this' Object.

        for(int i = 0; i < this.dataFields.length; i++){
            if(this.dataFields[i] != row.dataFields[i]){
                return false; //DOES NOT ACCOUNT FOR ATTRIBUTES BEING IN THE SAME ORDER
            }
        }
        return true;
    }

    @Override
    public int hashCode() {


        return this.key; //Not a great method
        //if you can figure out a way to return the first datafield, that would probably be a better hash code.
    }
}
