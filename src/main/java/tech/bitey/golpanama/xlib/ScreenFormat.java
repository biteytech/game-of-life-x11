// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class ScreenFormat {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ext_data"),
        Constants$root.C_INT$LAYOUT.withName("depth"),
        Constants$root.C_INT$LAYOUT.withName("bits_per_pixel"),
        Constants$root.C_INT$LAYOUT.withName("scanline_pad"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return ScreenFormat.$struct$LAYOUT;
    }
    static final VarHandle ext_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ext_data"));
    public static VarHandle ext_data$VH() {
        return ScreenFormat.ext_data$VH;
    }
    public static MemoryAddress ext_data$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ScreenFormat.ext_data$VH.get(seg);
    }
    public static void ext_data$set( MemorySegment seg, MemoryAddress x) {
        ScreenFormat.ext_data$VH.set(seg, x);
    }
    public static MemoryAddress ext_data$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ScreenFormat.ext_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ext_data$set(MemorySegment seg, long index, MemoryAddress x) {
        ScreenFormat.ext_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle depth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("depth"));
    public static VarHandle depth$VH() {
        return ScreenFormat.depth$VH;
    }
    public static int depth$get(MemorySegment seg) {
        return (int)ScreenFormat.depth$VH.get(seg);
    }
    public static void depth$set( MemorySegment seg, int x) {
        ScreenFormat.depth$VH.set(seg, x);
    }
    public static int depth$get(MemorySegment seg, long index) {
        return (int)ScreenFormat.depth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void depth$set(MemorySegment seg, long index, int x) {
        ScreenFormat.depth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bits_per_pixel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bits_per_pixel"));
    public static VarHandle bits_per_pixel$VH() {
        return ScreenFormat.bits_per_pixel$VH;
    }
    public static int bits_per_pixel$get(MemorySegment seg) {
        return (int)ScreenFormat.bits_per_pixel$VH.get(seg);
    }
    public static void bits_per_pixel$set( MemorySegment seg, int x) {
        ScreenFormat.bits_per_pixel$VH.set(seg, x);
    }
    public static int bits_per_pixel$get(MemorySegment seg, long index) {
        return (int)ScreenFormat.bits_per_pixel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bits_per_pixel$set(MemorySegment seg, long index, int x) {
        ScreenFormat.bits_per_pixel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle scanline_pad$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("scanline_pad"));
    public static VarHandle scanline_pad$VH() {
        return ScreenFormat.scanline_pad$VH;
    }
    public static int scanline_pad$get(MemorySegment seg) {
        return (int)ScreenFormat.scanline_pad$VH.get(seg);
    }
    public static void scanline_pad$set( MemorySegment seg, int x) {
        ScreenFormat.scanline_pad$VH.set(seg, x);
    }
    public static int scanline_pad$get(MemorySegment seg, long index) {
        return (int)ScreenFormat.scanline_pad$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void scanline_pad$set(MemorySegment seg, long index, int x) {
        ScreenFormat.scanline_pad$VH.set(seg.asSlice(index*sizeof()), x);
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


