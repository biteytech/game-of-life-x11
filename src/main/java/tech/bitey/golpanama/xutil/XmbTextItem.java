// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XmbTextItem {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("chars"),
        Constants$root.C_INT$LAYOUT.withName("nchars"),
        Constants$root.C_INT$LAYOUT.withName("delta"),
        Constants$root.C_POINTER$LAYOUT.withName("font_set")
    );
    public static MemoryLayout $LAYOUT() {
        return XmbTextItem.$struct$LAYOUT;
    }
    static final VarHandle chars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("chars"));
    public static VarHandle chars$VH() {
        return XmbTextItem.chars$VH;
    }
    public static MemoryAddress chars$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XmbTextItem.chars$VH.get(seg);
    }
    public static void chars$set( MemorySegment seg, MemoryAddress x) {
        XmbTextItem.chars$VH.set(seg, x);
    }
    public static MemoryAddress chars$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XmbTextItem.chars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void chars$set(MemorySegment seg, long index, MemoryAddress x) {
        XmbTextItem.chars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nchars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nchars"));
    public static VarHandle nchars$VH() {
        return XmbTextItem.nchars$VH;
    }
    public static int nchars$get(MemorySegment seg) {
        return (int)XmbTextItem.nchars$VH.get(seg);
    }
    public static void nchars$set( MemorySegment seg, int x) {
        XmbTextItem.nchars$VH.set(seg, x);
    }
    public static int nchars$get(MemorySegment seg, long index) {
        return (int)XmbTextItem.nchars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nchars$set(MemorySegment seg, long index, int x) {
        XmbTextItem.nchars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle delta$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("delta"));
    public static VarHandle delta$VH() {
        return XmbTextItem.delta$VH;
    }
    public static int delta$get(MemorySegment seg) {
        return (int)XmbTextItem.delta$VH.get(seg);
    }
    public static void delta$set( MemorySegment seg, int x) {
        XmbTextItem.delta$VH.set(seg, x);
    }
    public static int delta$get(MemorySegment seg, long index) {
        return (int)XmbTextItem.delta$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void delta$set(MemorySegment seg, long index, int x) {
        XmbTextItem.delta$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle font_set$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("font_set"));
    public static VarHandle font_set$VH() {
        return XmbTextItem.font_set$VH;
    }
    public static MemoryAddress font_set$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XmbTextItem.font_set$VH.get(seg);
    }
    public static void font_set$set( MemorySegment seg, MemoryAddress x) {
        XmbTextItem.font_set$VH.set(seg, x);
    }
    public static MemoryAddress font_set$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XmbTextItem.font_set$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void font_set$set(MemorySegment seg, long index, MemoryAddress x) {
        XmbTextItem.font_set$VH.set(seg.asSlice(index*sizeof()), x);
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

