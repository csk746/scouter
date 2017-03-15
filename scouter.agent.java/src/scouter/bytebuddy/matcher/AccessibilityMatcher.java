// Generated by delombok at Sun Feb 26 12:31:38 KST 2017
package scouter.bytebuddy.matcher;

import scouter.bytebuddy.description.ByteCodeElement;
import scouter.bytebuddy.description.type.TypeDescription;

/**
 * An element matcher that validates that a given byte code element is accessible to a given type.
 *
 * @param <T>The type of the matched entity.
 */
public class AccessibilityMatcher<T extends ByteCodeElement> extends ElementMatcher.Junction.AbstractBase<T> {
    /**
     * The type that is to be checked for its viewing rights.
     */
    private final TypeDescription typeDescription;

    /**
     * Creates a matcher that validates that a byte code element can be seen by a given type.
     *
     * @param typeDescription The type that is to be checked for its viewing rights.
     */
    public AccessibilityMatcher(TypeDescription typeDescription) {
        this.typeDescription = typeDescription;
    }

    @Override
    public boolean matches(T target) {
        return target.isAccessibleTo(typeDescription);
    }

    @Override
    public String toString() {
        return "isAccessibleTo(" + typeDescription + ")";
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof AccessibilityMatcher)) return false;
        final AccessibilityMatcher<?> other = (AccessibilityMatcher<?>) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$typeDescription = this.typeDescription;
        final java.lang.Object other$typeDescription = other.typeDescription;
        if (this$typeDescription == null ? other$typeDescription != null : !this$typeDescription.equals(other$typeDescription)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof AccessibilityMatcher;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $typeDescription = this.typeDescription;
        result = result * PRIME + ($typeDescription == null ? 43 : $typeDescription.hashCode());
        return result;
    }
}
