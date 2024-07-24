package course.equalsTostringHashPkg;

public class ParentClass {
    String name;

    public String toString() {
        System.out.println(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        return "This is Parent Class";
    }

    public boolean equals(ParentClass that) {
        return this.name == that.name;
    }

    // below is default implementation
    // @Override
    // public int hashCode() {
    // final int prime = 31;
    // int result = 1;
    // result = prime * result + ((name == null) ? 0 : name.hashCode());
    // return result;
    // }

    // below is default implementation
    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj)
    // return true;
    // if (obj == null)
    // return false;
    // if (getClass() != obj.getClass())
    // return false;
    // ParentClass other = (ParentClass) obj;
    // if (name == null) {
    // if (other.name != null)
    // return false;
    // } else if (!name.equals(other.name))
    // return false;
    // return true;
    // }

}
