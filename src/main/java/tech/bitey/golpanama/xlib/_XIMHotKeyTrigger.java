// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _XIMHotKeyTrigger {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("keysym"),
        Constants$root.C_INT$LAYOUT.withName("modifier"),
        Constants$root.C_INT$LAYOUT.withName("modifier_mask")
    ).withName("_XIMHotKeyTrigger");
    public static MemoryLayout $LAYOUT() {
        return _XIMHotKeyTrigger.$struct$LAYOUT;
    }
    static final VarHandle keysym$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("keysym"));
    public static VarHandle keysym$VH() {
        return _XIMHotKeyTrigger.keysym$VH;
    }
    public static long keysym$get(MemorySegment seg) {
        return (long)_XIMHotKeyTrigger.keysym$VH.get(seg);
    }
    public static void keysym$set( MemorySegment seg, long x) {
        _XIMHotKeyTrigger.keysym$VH.set(seg, x);
    }
    public static long keysym$get(MemorySegment seg, long index) {
        return (long)_XIMHotKeyTrigger.keysym$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void keysym$set(MemorySegment seg, long index, long x) {
        _XIMHotKeyTrigger.keysym$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle modifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("modifier"));
    public static VarHandle modifier$VH() {
        return _XIMHotKeyTrigger.modifier$VH;
    }
    public static int modifier$get(MemorySegment seg) {
        return (int)_XIMHotKeyTrigger.modifier$VH.get(seg);
    }
    public static void modifier$set( MemorySegment seg, int x) {
        _XIMHotKeyTrigger.modifier$VH.set(seg, x);
    }
    public static int modifier$get(MemorySegment seg, long index) {
        return (int)_XIMHotKeyTrigger.modifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void modifier$set(MemorySegment seg, long index, int x) {
        _XIMHotKeyTrigger.modifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle modifier_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("modifier_mask"));
    public static VarHandle modifier_mask$VH() {
        return _XIMHotKeyTrigger.modifier_mask$VH;
    }
    public static int modifier_mask$get(MemorySegment seg) {
        return (int)_XIMHotKeyTrigger.modifier_mask$VH.get(seg);
    }
    public static void modifier_mask$set( MemorySegment seg, int x) {
        _XIMHotKeyTrigger.modifier_mask$VH.set(seg, x);
    }
    public static int modifier_mask$get(MemorySegment seg, long index) {
        return (int)_XIMHotKeyTrigger.modifier_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void modifier_mask$set(MemorySegment seg, long index, int x) {
        _XIMHotKeyTrigger.modifier_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


