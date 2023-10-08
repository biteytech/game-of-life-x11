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
 *     int charset_count;
 *     char** charset_list;
 * };
 * }
 */
public class XOMCharSetList {

    public static MemoryLayout $LAYOUT() {
        return constants$111.const$2;
    }
    public static VarHandle charset_count$VH() {
        return constants$111.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int charset_count;
     * }
     */
    public static int charset_count$get(MemorySegment seg) {
        return (int)constants$111.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int charset_count;
     * }
     */
    public static void charset_count$set(MemorySegment seg, int x) {
        constants$111.const$3.set(seg, x);
    }
    public static int charset_count$get(MemorySegment seg, long index) {
        return (int)constants$111.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void charset_count$set(MemorySegment seg, long index, int x) {
        constants$111.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle charset_list$VH() {
        return constants$111.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char** charset_list;
     * }
     */
    public static MemorySegment charset_list$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$111.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char** charset_list;
     * }
     */
    public static void charset_list$set(MemorySegment seg, MemorySegment x) {
        constants$111.const$4.set(seg, x);
    }
    public static MemorySegment charset_list$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$111.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void charset_list$set(MemorySegment seg, long index, MemorySegment x) {
        constants$111.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


