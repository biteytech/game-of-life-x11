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
 *     int max_keypermod;
 *     KeyCode* modifiermap;
 * };
 * }
 */
public class XModifierKeymap {

    public static MemoryLayout $LAYOUT() {
        return constants$47.const$5;
    }
    public static VarHandle max_keypermod$VH() {
        return constants$48.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int max_keypermod;
     * }
     */
    public static int max_keypermod$get(MemorySegment seg) {
        return (int)constants$48.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int max_keypermod;
     * }
     */
    public static void max_keypermod$set(MemorySegment seg, int x) {
        constants$48.const$0.set(seg, x);
    }
    public static int max_keypermod$get(MemorySegment seg, long index) {
        return (int)constants$48.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void max_keypermod$set(MemorySegment seg, long index, int x) {
        constants$48.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle modifiermap$VH() {
        return constants$48.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * KeyCode* modifiermap;
     * }
     */
    public static MemorySegment modifiermap$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$48.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * KeyCode* modifiermap;
     * }
     */
    public static void modifiermap$set(MemorySegment seg, MemorySegment x) {
        constants$48.const$1.set(seg, x);
    }
    public static MemorySegment modifiermap$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$48.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void modifiermap$set(MemorySegment seg, long index, MemorySegment x) {
        constants$48.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


