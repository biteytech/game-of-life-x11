// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _XIMHotKeyTriggers {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("num_hot_key"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("key")
    ).withName("_XIMHotKeyTriggers");
    public static MemoryLayout $LAYOUT() {
        return _XIMHotKeyTriggers.$struct$LAYOUT;
    }
    static final VarHandle num_hot_key$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_hot_key"));
    public static VarHandle num_hot_key$VH() {
        return _XIMHotKeyTriggers.num_hot_key$VH;
    }
    public static int num_hot_key$get(MemorySegment seg) {
        return (int)_XIMHotKeyTriggers.num_hot_key$VH.get(seg);
    }
    public static void num_hot_key$set( MemorySegment seg, int x) {
        _XIMHotKeyTriggers.num_hot_key$VH.set(seg, x);
    }
    public static int num_hot_key$get(MemorySegment seg, long index) {
        return (int)_XIMHotKeyTriggers.num_hot_key$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_hot_key$set(MemorySegment seg, long index, int x) {
        _XIMHotKeyTriggers.num_hot_key$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle key$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("key"));
    public static VarHandle key$VH() {
        return _XIMHotKeyTriggers.key$VH;
    }
    public static MemoryAddress key$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_XIMHotKeyTriggers.key$VH.get(seg);
    }
    public static void key$set( MemorySegment seg, MemoryAddress x) {
        _XIMHotKeyTriggers.key$VH.set(seg, x);
    }
    public static MemoryAddress key$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_XIMHotKeyTriggers.key$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void key$set(MemorySegment seg, long index, MemoryAddress x) {
        _XIMHotKeyTriggers.key$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


