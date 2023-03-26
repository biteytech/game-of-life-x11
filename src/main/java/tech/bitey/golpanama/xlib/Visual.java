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
 *     XExtData* ext_data;
 *     VisualID visualid;
 *     int class;
 *     unsigned long red_mask;
 *     unsigned long green_mask;
 *     unsigned long blue_mask;
 *     int bits_per_rgb;
 *     int map_entries;
 * };
 * }
 */
public class Visual {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    /**
     * Getter for field:
     * {@snippet :
     * XExtData* ext_data;
     * }
     */
    public static MemorySegment ext_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)Visual.ext_data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * XExtData* ext_data;
     * }
     */
    public static void ext_data$set(MemorySegment seg, MemorySegment x) {
        Visual.ext_data$VH.set(seg, x);
    }
    public static MemorySegment ext_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)Visual.ext_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ext_data$set(MemorySegment seg, long index, MemorySegment x) {
        Visual.ext_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle visualid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("visualid"));
    public static VarHandle visualid$VH() {
        return Visual.visualid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VisualID visualid;
     * }
     */
    public static long visualid$get(MemorySegment seg) {
        return (long)Visual.visualid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VisualID visualid;
     * }
     */
    public static void visualid$set(MemorySegment seg, long x) {
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
    /**
     * Getter for field:
     * {@snippet :
     * int class;
     * }
     */
    public static int class_$get(MemorySegment seg) {
        return (int)Visual.class_$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int class;
     * }
     */
    public static void class_$set(MemorySegment seg, int x) {
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
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long red_mask;
     * }
     */
    public static long red_mask$get(MemorySegment seg) {
        return (long)Visual.red_mask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long red_mask;
     * }
     */
    public static void red_mask$set(MemorySegment seg, long x) {
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
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long green_mask;
     * }
     */
    public static long green_mask$get(MemorySegment seg) {
        return (long)Visual.green_mask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long green_mask;
     * }
     */
    public static void green_mask$set(MemorySegment seg, long x) {
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
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long blue_mask;
     * }
     */
    public static long blue_mask$get(MemorySegment seg) {
        return (long)Visual.blue_mask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long blue_mask;
     * }
     */
    public static void blue_mask$set(MemorySegment seg, long x) {
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
    /**
     * Getter for field:
     * {@snippet :
     * int bits_per_rgb;
     * }
     */
    public static int bits_per_rgb$get(MemorySegment seg) {
        return (int)Visual.bits_per_rgb$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int bits_per_rgb;
     * }
     */
    public static void bits_per_rgb$set(MemorySegment seg, int x) {
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
    /**
     * Getter for field:
     * {@snippet :
     * int map_entries;
     * }
     */
    public static int map_entries$get(MemorySegment seg) {
        return (int)Visual.map_entries$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int map_entries;
     * }
     */
    public static void map_entries$set(MemorySegment seg, int x) {
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
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


