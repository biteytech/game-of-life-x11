// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class Visual {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ext_data"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("visualid"),
        Constants$root.C_INT$LAYOUT.withName("class"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("red_mask"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("green_mask"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("blue_mask"),
        Constants$root.C_INT$LAYOUT.withName("bits_per_rgb"),
        Constants$root.C_INT$LAYOUT.withName("map_entries")
    );
    public static MemoryLayout $LAYOUT() {
        return Visual.$struct$LAYOUT;
    }
    static final VarHandle ext_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ext_data"));
    public static VarHandle ext_data$VH() {
        return Visual.ext_data$VH;
    }
    public static MemoryAddress ext_data$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)Visual.ext_data$VH.get(seg);
    }
    public static void ext_data$set( MemorySegment seg, MemoryAddress x) {
        Visual.ext_data$VH.set(seg, x);
    }
    public static MemoryAddress ext_data$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)Visual.ext_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ext_data$set(MemorySegment seg, long index, MemoryAddress x) {
        Visual.ext_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle visualid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("visualid"));
    public static VarHandle visualid$VH() {
        return Visual.visualid$VH;
    }
    public static long visualid$get(MemorySegment seg) {
        return (long)Visual.visualid$VH.get(seg);
    }
    public static void visualid$set( MemorySegment seg, long x) {
        Visual.visualid$VH.set(seg, x);
    }
    public static long visualid$get(MemorySegment seg, long index) {
        return (long)Visual.visualid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void visualid$set(MemorySegment seg, long index, long x) {
        Visual.visualid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle class_$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("class"));
    public static VarHandle class_$VH() {
        return Visual.class_$VH;
    }
    public static int class_$get(MemorySegment seg) {
        return (int)Visual.class_$VH.get(seg);
    }
    public static void class_$set( MemorySegment seg, int x) {
        Visual.class_$VH.set(seg, x);
    }
    public static int class_$get(MemorySegment seg, long index) {
        return (int)Visual.class_$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void class_$set(MemorySegment seg, long index, int x) {
        Visual.class_$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle red_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("red_mask"));
    public static VarHandle red_mask$VH() {
        return Visual.red_mask$VH;
    }
    public static long red_mask$get(MemorySegment seg) {
        return (long)Visual.red_mask$VH.get(seg);
    }
    public static void red_mask$set( MemorySegment seg, long x) {
        Visual.red_mask$VH.set(seg, x);
    }
    public static long red_mask$get(MemorySegment seg, long index) {
        return (long)Visual.red_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void red_mask$set(MemorySegment seg, long index, long x) {
        Visual.red_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle green_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("green_mask"));
    public static VarHandle green_mask$VH() {
        return Visual.green_mask$VH;
    }
    public static long green_mask$get(MemorySegment seg) {
        return (long)Visual.green_mask$VH.get(seg);
    }
    public static void green_mask$set( MemorySegment seg, long x) {
        Visual.green_mask$VH.set(seg, x);
    }
    public static long green_mask$get(MemorySegment seg, long index) {
        return (long)Visual.green_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void green_mask$set(MemorySegment seg, long index, long x) {
        Visual.green_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle blue_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("blue_mask"));
    public static VarHandle blue_mask$VH() {
        return Visual.blue_mask$VH;
    }
    public static long blue_mask$get(MemorySegment seg) {
        return (long)Visual.blue_mask$VH.get(seg);
    }
    public static void blue_mask$set( MemorySegment seg, long x) {
        Visual.blue_mask$VH.set(seg, x);
    }
    public static long blue_mask$get(MemorySegment seg, long index) {
        return (long)Visual.blue_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void blue_mask$set(MemorySegment seg, long index, long x) {
        Visual.blue_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bits_per_rgb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bits_per_rgb"));
    public static VarHandle bits_per_rgb$VH() {
        return Visual.bits_per_rgb$VH;
    }
    public static int bits_per_rgb$get(MemorySegment seg) {
        return (int)Visual.bits_per_rgb$VH.get(seg);
    }
    public static void bits_per_rgb$set( MemorySegment seg, int x) {
        Visual.bits_per_rgb$VH.set(seg, x);
    }
    public static int bits_per_rgb$get(MemorySegment seg, long index) {
        return (int)Visual.bits_per_rgb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bits_per_rgb$set(MemorySegment seg, long index, int x) {
        Visual.bits_per_rgb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle map_entries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("map_entries"));
    public static VarHandle map_entries$VH() {
        return Visual.map_entries$VH;
    }
    public static int map_entries$get(MemorySegment seg) {
        return (int)Visual.map_entries$VH.get(seg);
    }
    public static void map_entries$set( MemorySegment seg, int x) {
        Visual.map_entries$VH.set(seg, x);
    }
    public static int map_entries$get(MemorySegment seg, long index) {
        return (int)Visual.map_entries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void map_entries$set(MemorySegment seg, long index, int x) {
        Visual.map_entries$VH.set(seg.asSlice(index*sizeof()), x);
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


