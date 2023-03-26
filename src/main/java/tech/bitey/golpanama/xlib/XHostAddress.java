// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     int family;
 *     int length;
 *     char* address;
 * };
 * }
 */
public class XHostAddress {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("family"),
        Constants$root.C_INT$LAYOUT.withName("length"),
        Constants$root.C_POINTER$LAYOUT.withName("address")
    );
    public static MemoryLayout $LAYOUT() {
        return XHostAddress.$struct$LAYOUT;
    }
    static final VarHandle family$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("family"));
    public static VarHandle family$VH() {
        return XHostAddress.family$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int family;
     * }
     */
    public static int family$get(MemorySegment seg) {
        return (int)XHostAddress.family$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int family;
     * }
     */
    public static void family$set(MemorySegment seg, int x) {
        XHostAddress.family$VH.set(seg, x);
    }
    public static int family$get(MemorySegment seg, long index) {
        return (int)XHostAddress.family$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void family$set(MemorySegment seg, long index, int x) {
        XHostAddress.family$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return XHostAddress.length$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int length;
     * }
     */
    public static int length$get(MemorySegment seg) {
        return (int)XHostAddress.length$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int length;
     * }
     */
    public static void length$set(MemorySegment seg, int x) {
        XHostAddress.length$VH.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)XHostAddress.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        XHostAddress.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle address$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("address"));
    public static VarHandle address$VH() {
        return XHostAddress.address$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* address;
     * }
     */
    public static MemorySegment address$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)XHostAddress.address$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* address;
     * }
     */
    public static void address$set(MemorySegment seg, MemorySegment x) {
        XHostAddress.address$VH.set(seg, x);
    }
    public static MemorySegment address$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)XHostAddress.address$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void address$set(MemorySegment seg, long index, MemorySegment x) {
        XHostAddress.address$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


