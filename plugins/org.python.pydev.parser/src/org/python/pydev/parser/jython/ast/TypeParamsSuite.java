// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

import org.python.pydev.parser.jython.SimpleNode;
import java.util.Arrays;

public final class TypeParamsSuite extends type_params_suiteType {
    public type_paramType[] typeParams;

    public TypeParamsSuite(type_paramType[] typeParams) {
        this.typeParams = typeParams;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(typeParams);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        TypeParamsSuite other = (TypeParamsSuite) obj;
        if (!Arrays.equals(typeParams, other.typeParams)) return false;
        return true;
    }
    @Override
    public TypeParamsSuite createCopy() {
        return createCopy(true);
    }
    @Override
    public TypeParamsSuite createCopy(boolean copyComments) {
        type_paramType[] new0;
        if(this.typeParams != null){
        new0 = new type_paramType[this.typeParams.length];
        for(int i=0;i<this.typeParams.length;i++){
            new0[i] = (type_paramType) (this.typeParams[i] != null?
            this.typeParams[i].createCopy(copyComments):null);
        }
        }else{
            new0 = this.typeParams;
        }
        TypeParamsSuite temp = new TypeParamsSuite(new0);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if(this.specialsBefore != null && copyComments){
            for(Object o:this.specialsBefore){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy(copyComments));
                }
            }
        }
        if(this.specialsAfter != null && copyComments){
            for(Object o:this.specialsAfter){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy(copyComments));
                }
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("TypeParamsSuite[");
        sb.append("typeParams=");
        sb.append(dumpThis(this.typeParams));
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitTypeParamsSuite(this);
    }

    @Override
    public void traverse(VisitorIF visitor) throws Exception {
        if (typeParams != null) {
            for (int i = 0; i < typeParams.length; i++) {
                if (typeParams[i] != null) {
                    typeParams[i].accept(visitor);
                }
            }
        }
    }

}
