// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

import org.python.pydev.parser.jython.SimpleNode;
import java.util.Arrays;

public final class ParamSpec extends type_paramType {
    public NameTokType name;
    public exprType defaultValue;

    public ParamSpec(NameTokType name, exprType defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((defaultValue == null) ? 0 : defaultValue.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ParamSpec other = (ParamSpec) obj;
        if (name == null) { if (other.name != null) return false;}
        else if (!name.equals(other.name)) return false;
        if (defaultValue == null) { if (other.defaultValue != null) return false;}
        else if (!defaultValue.equals(other.defaultValue)) return false;
        return true;
    }
    @Override
    public ParamSpec createCopy() {
        return createCopy(true);
    }
    @Override
    public ParamSpec createCopy(boolean copyComments) {
        ParamSpec temp = new ParamSpec(name!=null?(NameTokType)name.createCopy(copyComments):null,
        defaultValue!=null?(exprType)defaultValue.createCopy(copyComments):null);
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
        StringBuffer sb = new StringBuffer("ParamSpec[");
        sb.append("name=");
        sb.append(dumpThis(this.name));
        sb.append(", ");
        sb.append("defaultValue=");
        sb.append(dumpThis(this.defaultValue));
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitParamSpec(this);
    }

    @Override
    public void traverse(VisitorIF visitor) throws Exception {
        if (name != null) {
            name.accept(visitor);
        }
        if (defaultValue != null) {
            defaultValue.accept(visitor);
        }
    }

}
